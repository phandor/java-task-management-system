package com.taskmanager.entity;

public enum Status {

  // Pending approval from manager, client feedback, etc
  PENDING,

  // Task has been rejected (not approved, invalid, etc)
  REJECTED,

  // Work in progress
  IN_PROGRESS,

  // Task has been finished
  COMPLETED,

  // Task is on hold for some reason (blocking issues, waiting for feedback, etc)
  ON_HOLD,

  // Task is no longer active
  CANCELLED
}
