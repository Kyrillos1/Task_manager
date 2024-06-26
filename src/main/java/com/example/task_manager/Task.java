package com.example.task_manager;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task implements Comparable<Task>, Serializable {
    private static int ID = 100;
    private String title;
    private String description;
    private Priority priority;
    private Status status;
    private LocalDate deadline;
    private LocalDateTime creationDate;
    private LocalDateTime completionDate;
    private String assignee;
    private AssigneeType assigneeType;
    private String notes;
    private boolean selected; // New boolean property for selection

    public enum Priority {
        LOW, MEDIUM, HIGH
    }

    public enum Status {
        TODO, IN_PROGRESS, DONE;
        @Override
        public String toString() {
            // Customize the string representation here
            return super.toString();
        }
    }
    public enum Status2 {
        TODO, IN_PROGRESS, DONE, ALL;
        @Override
        public String toString() {
            return super.toString();
        }
    }
    public enum AssigneeType{
        TEAM, INDIVIDUAL, UNKNOWN
    }

    Task(String title, String description, Priority priority, Status status, LocalDate deadline, String assignee, AssigneeType assigneeType) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;
        this.deadline = deadline;
        this.assignee = assignee;
        this.assigneeType = assigneeType;
        ID++; // Increment ID here
        this.notes = null;
    }

    Task(String title, String description, Priority priority, Status status, LocalDate deadline, String assignee, AssigneeType assigneeType, String notes) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;
        this.deadline = deadline;
        this.assignee = assignee;
        this.assigneeType = assigneeType;
        ID++; // Increment ID here
        this.notes = notes;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getID() {
        return ID;
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

    public Priority getPriority() {
        return priority != null ? priority : Priority.LOW; // Return a default value if priority is null
    }

    public Status getStatus() {
        return status != null ? status : Status.TODO; // Return a default value if status is null
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public AssigneeType getAssigneeType() {
        return assigneeType != null ? assigneeType : AssigneeType.INDIVIDUAL; // Return a default value if priority is null
    }

    public void setAssigneeType(AssigneeType assigneeType) {
        this.assigneeType = assigneeType;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(LocalDateTime completionDate) {
        this.completionDate = completionDate;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    @Override
    public int compareTo(Task t){
        return this.deadline.compareTo(t.getDeadline());
    }

}
