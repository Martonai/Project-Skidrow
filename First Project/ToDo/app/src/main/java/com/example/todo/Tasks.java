package com.example.todo;

import java.time.LocalDateTime;
import java.util.Date;

public class Tasks
{

    private String explantation;
    private String condition;
    private String taskgiven;
    private String deadline;

    public Tasks()
    {
    }

    public String getExplantation() {
        return explantation;
    }

    public void setExplantation(String explantation) {
        this.explantation = explantation;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getTaskgiven() {
        return taskgiven;
    }

    public void setTaskgiven(String taskgiven) {
        this.taskgiven = taskgiven;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}
