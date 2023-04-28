package io.github.tomaskul.springcheckyourworkstudentapi.service;

import java.util.UUID;

public interface StudentService {
    Iterable<UUID> getAllIds();
}
