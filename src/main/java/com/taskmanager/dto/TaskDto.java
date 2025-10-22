package com.taskmanager.dto;

import com.taskmanager.entity.TaskPriority;

public class TaskDto {
  private Long id;
  private String title;
  private String description;
  private TaskPriority priority;
  private boolean completed;

  // constructor
  public TaskDto(
      Long id,
      String title,
      String description,
      TaskPriority priority,
      boolean completed) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.priority = priority;
    this.completed = completed;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TaskPriority getPriority() {
    return priority;
  }

  public void setPriority(TaskPriority priority) {
    this.priority = priority;
  }

  public boolean isCompleted() {
    return completed;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }
}
