package com.taskmanager.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
  // Notiz: Vorerst nur für die Demo, es muss noch die DB
  // aufgebaut werden
  @Bean
  public UserDetailsService userDetailsService() {
    UserDetails user = User.withDefaultPasswordEncoder() // veraltet, aber okay für die demo
        .username("admin")
        .password("test")
        .roles("USER")
        .build();
    return new InMemoryUserDetailsManager(user);
  }

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .authorizeHttpRequests(authz -> authz
            .anyRequest().authenticated())
        .httpBasic(basic -> basic
            .authenticationEntryPoint((request, response, authException) -> {
              response.addHeader("Authentication", "Application=\"Task Manager\"");
              response.sendError(401, authException.getMessage());
            }))
        .formLogin(form -> form
            .defaultSuccessUrl("/taskmanager", true)
            .permitAll());

    return http.build();
  }
}
