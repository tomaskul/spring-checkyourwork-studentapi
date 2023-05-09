package io.github.tomaskul.springcheckyourworkstudentapi.service.impl;

import io.github.tomaskul.springcheckyourworkstudentapi.entity.StudentEntity;
import io.github.tomaskul.springcheckyourworkstudentapi.repository.StudentRepository;
import io.github.tomaskul.springcheckyourworkstudentapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

@Service
public class InMemoryStudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Iterable<UUID> getAllIds() {
        Iterable<StudentEntity> entities = studentRepository.findAll();

        Collection<UUID> result = new ArrayList<>();
        entities.forEach(studentEntity -> { result.add(studentEntity.getID()); } );

        return result;
    }
}
