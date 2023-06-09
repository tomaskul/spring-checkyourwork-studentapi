package io.github.tomaskul.springcheckyourworkstudentapi.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Table(name = "CYW_STUDENTS")
public class StudentEntity {

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
    private String fullName;

    public UUID getID() {
        return ID;
    }
}
