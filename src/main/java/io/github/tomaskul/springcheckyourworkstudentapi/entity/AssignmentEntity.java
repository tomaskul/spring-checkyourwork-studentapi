package io.github.tomaskul.springcheckyourworkstudentapi.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "CYW_ASSIGNMENTS")
public class AssignmentEntity {
    // Note: Annotations based on this response: https://stackoverflow.com/a/56362611.
    @Id
    @GeneratedValue(generator = "UUID", strategy = GenerationType.AUTO)
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "ID", updatable = false, nullable = false)
    @ColumnDefault("random_uuid()")
    private UUID ID;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private Date publishedDate;

    @Column(nullable = false)
    private Date dueDate;

    @Column(nullable = false)
    private String title;
    private String description;
    private int creditCount;
    private boolean isExpired;

    public UUID getID() {
        return ID;
    }

    public String getAuthor() {
        return author;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCreditCount() {
        return creditCount;
    }

    public boolean isExpired() {
        return isExpired;
    }
}
