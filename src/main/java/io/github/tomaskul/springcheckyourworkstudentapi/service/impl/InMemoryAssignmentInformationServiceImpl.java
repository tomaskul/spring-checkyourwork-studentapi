package io.github.tomaskul.springcheckyourworkstudentapi.service.impl;

import io.github.tomaskul.springcheckyourworkstudentapi.entity.AssignmentEntity;
import io.github.tomaskul.springcheckyourworkstudentapi.model.Assignment;
import io.github.tomaskul.springcheckyourworkstudentapi.model.AssignmentSummary;
import io.github.tomaskul.springcheckyourworkstudentapi.repository.ReadOnlyAssignmentRepository;
import io.github.tomaskul.springcheckyourworkstudentapi.service.AssignmentInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InMemoryAssignmentInformationServiceImpl implements AssignmentInformationService {

    @Autowired
    private ReadOnlyAssignmentRepository readOnlyAssignmentRepository;

    public boolean isExpired(UUID id) {
        AssignmentEntity entity = readOnlyAssignmentRepository.findById(id);
        if (entity == null){
            return false;
        }

        return entity.isExpired();
    }

    public Assignment getById(UUID id) {
        AssignmentEntity entity = readOnlyAssignmentRepository.findById(id);
        if (entity == null) {
            return null;
        }

        // TODO: workout criteria logic.
        return new Assignment(entity.getID(), entity.getAuthor(), entity.getPublishedDate(), entity.getDueDate(),
                entity.getTitle(), entity.getDescription(), entity.getCreditCount(), entity.isExpired(), null);
    }

    public Iterable<AssignmentSummary> getAssignedSummaries(UUID studentId) {
        // TODO: add student-assignment mappings for extra complexity.
        Iterable<AssignmentEntity> entities = readOnlyAssignmentRepository.findAll();
        if (entities == null) {
            return null;
        }

        List<AssignmentSummary> results = new ArrayList<>();
        for (AssignmentEntity entity : entities) {
            results.add(new AssignmentSummary(entity.getID(), entity.getDueDate(), entity.isExpired(), entity.getTitle(), entity.getCreditCount()));
        }

        return results;
    }
}
