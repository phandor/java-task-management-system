package com.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TaskManagerApplication {

  @GetMapping("/helloworld")
  public String sayHello() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    SpringApplication.run(TaskManagerApplication.class, args);
  }
}