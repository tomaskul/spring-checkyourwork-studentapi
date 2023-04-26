package io.github.tomaskul.springcheckyourworkstudentapi.model;

import java.util.Collection;
import java.util.Date;
import java.util.UUID;

public class Assignment {
    public UUID ID;
    public String author;
    public Date publishedDate;
    public Date dueDate;
    public String title;
    public String description;
    public int creditCount;
    public boolean isExpired;
    public Collection<Criterion> criteria;

    public Assignment() {}

    public Assignment(UUID ID, String author, Date publishedDate, Date dueDate, String title, String description, int creditCount, boolean isExpired, Collection<Criterion> criteria) {
        this.ID = ID;
        this.author = author;
        this.publishedDate = publishedDate;
        this.dueDate = dueDate;
        this.title = title;
        this.description = description;
        this.creditCount = creditCount;
        this.isExpired = isExpired;
        this.criteria = criteria;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
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

    public int getCreditCount() {
        return creditCount;
    }

    public void setCreditCount(int creditCount) {
        this.creditCount = creditCount;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }

    public Collection<Criterion> getCriteria() {
        return criteria;
    }

    public void setCriteria(Collection<Criterion> criteria) {
        this.criteria = criteria;
    }
}
