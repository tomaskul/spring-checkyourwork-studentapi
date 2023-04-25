package io.github.tomaskul.springcheckyourworkstudentapi.model;

import java.util.UUID;

public class Assignment {
    public UUID ID;

    public Assignment() {
        this.ID = UUID.randomUUID();
    }
}
