package io.github.tomaskul.springcheckyourworkstudentapi.model;

import java.util.Date;
import java.util.UUID;

public class AssignmentSummary {
    public UUID ID;
    public Date dueDate;
    public boolean isExpired;
    public String title;
    public int creditCount;
}
