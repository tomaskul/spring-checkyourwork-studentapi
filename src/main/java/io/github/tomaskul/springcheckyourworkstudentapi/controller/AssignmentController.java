package io.github.tomaskul.springcheckyourworkstudentapi.controller;

import io.github.tomaskul.springcheckyourworkstudentapi.exception.RelevantException;
import io.github.tomaskul.springcheckyourworkstudentapi.model.Assignment;
import io.github.tomaskul.springcheckyourworkstudentapi.model.AssignmentSummary;
import io.github.tomaskul.springcheckyourworkstudentapi.service.AssignmentInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@RestController()
@RequestMapping("/api/v1/assignments/")
public class AssignmentController {

    @Autowired
    private AssignmentInformationService assignmentInformationService;

    @GetMapping("/all")
    public ResponseEntity<Iterable<AssignmentSummary>> getAll(){
        // TODO: get student UUID from request header.
        Iterable<AssignmentSummary> summaries = assignmentInformationService.getAssignedSummaries(UUID.randomUUID());
        if (summaries == null) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(summaries, HttpStatus.OK);
    }

    @GetMapping("/byId/{id}")
    public ResponseEntity<Assignment> getById(@PathVariable String id){
        Assignment entity = assignmentInformationService.getById(UUID.fromString(id));
        if (entity == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @PostMapping("/upload/{assignmentId}")
    public ResponseEntity<UUID> upload(@RequestBody MultipartFile uploadFile, @PathVariable UUID assignmentId){
        if (uploadFile.isEmpty()){
            throw new RelevantException();
        }
        return new ResponseEntity<>(assignmentId, HttpStatus.OK);
    }
}
