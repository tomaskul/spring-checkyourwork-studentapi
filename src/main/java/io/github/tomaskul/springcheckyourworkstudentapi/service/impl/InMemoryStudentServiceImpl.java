package io.github.tomaskul.springcheckyourworkstudentapi.service.impl;

import io.github.tomaskul.springcheckyourworkstudentapi.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

@Service
public class InMemoryStudentServiceImpl implements StudentService {

    private Collection<UUID> students;

    public InMemoryStudentServiceImpl(){
        students = new ArrayList<>();
        students.add(UUID.fromString("df36d212-b96c-41d3-b395-f5b793bb9d01"));
        students.add(UUID.fromString("6ca9daa4-f37f-48ed-ad4e-a50797e3f122"));
        students.add(UUID.fromString("da1ed158-b630-4046-8338-812b700230af"));
        students.add(UUID.fromString("de07f7a6-1d12-49b0-a1ad-44b9cf5883d4"));
    }

    public Collection<UUID> getAllIds() {
        return students;
    }
}
