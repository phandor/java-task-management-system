package com.taskmanager.entity;

public enum Role {

  // All permissions
  ADMIN,

  // Highest level of access (can set pending tasks, approve tasks, etc)
  MANAGER,

  // Another medium level access (comment and view tasks)
  CLIENT,

  // Medium level access (create, update and delete tasks)
  USER,

  // Basic user with limited permissions (view tasks only)
  GUEST

}
