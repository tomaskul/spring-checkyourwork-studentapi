package io.github.tomaskul.springcheckyourworkstudentapi.repository;

import io.github.tomaskul.springcheckyourworkstudentapi.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, UUID> {
}
