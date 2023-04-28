package io.github.tomaskul.springcheckyourworkstudentapi.model;

import java.util.Date;
import java.util.UUID;

public class AssignmentSummary {
    public UUID ID;
    public Date dueDate;
    public boolean isExpired;
    public String title;
    public int creditCount;

    public AssignmentSummary() {}

    public AssignmentSummary(UUID ID, Date dueDate, boolean isExpired, String title, int creditCount) {
        this.ID = ID;
        this.dueDate = dueDate;
        this.isExpired = isExpired;
        this.title = title;
        this.creditCount = creditCount;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCreditCount() {
        return creditCount;
    }

    public void setCreditCount(int creditCount) {
        this.creditCount = creditCount;
    }
}
