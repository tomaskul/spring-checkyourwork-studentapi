package io.github.tomaskul.springcheckyourworkstudentapi.service;

import java.util.Collection;
import java.util.UUID;

public interface StudentService {
    Collection<UUID> getAllIds();
}
