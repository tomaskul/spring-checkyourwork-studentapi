package io.github.tomaskul.springcheckyourworkstudentapi.service;

import io.github.tomaskul.springcheckyourworkstudentapi.model.Assignment;
import io.github.tomaskul.springcheckyourworkstudentapi.model.AssignmentSummary;

import java.util.UUID;

public interface AssignmentInformationService {

    /**
     * Determines if specified assignment has expired (i.e., past due date).
     * @param id Assignment identifier.
     * @return true if assignment is past due date; otherwise false.
     */
    boolean isExpired(UUID id);

    /**
     * Gets assignment information by identifier.
     * @param id Assignment identifier.
     * @return Assignment if found; otherwise null.
     */
    Assignment getById(UUID id);

    /**
     * Gets summaries of assignments for specified student identifier.
     * @param studentId Student identifier.
     * @return Assignment summaries for the student if found; otherwise empty collection.
     */
    Iterable<AssignmentSummary> getAssignedSummaries(UUID studentId);
}
