package io.github.tomaskul.springcheckyourworkstudentapi.repository;

import io.github.tomaskul.springcheckyourworkstudentapi.entity.AssignmentEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

@org.springframework.stereotype.Repository
public interface ReadOnlyAssignmentRepository extends Repository<AssignmentEntity, UUID> {
    @Query(value = "SELECT * FROM CYW_ASSIGNMENTS WHERE ID=:id", nativeQuery = true)
    AssignmentEntity findById(@Param("id") UUID id);

    @Query(value = "SELECT * FROM CYW_ASSIGNMENTS", nativeQuery = true)
    Iterable<AssignmentEntity> findAll();
}
