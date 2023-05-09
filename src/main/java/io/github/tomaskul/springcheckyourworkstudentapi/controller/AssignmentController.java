package io.github.tomaskul.springcheckyourworkstudentapi.controller;

import io.github.tomaskul.springcheckyourworkstudentapi.exception.RelevantException;
import io.github.tomaskul.springcheckyourworkstudentapi.model.Assignment;
import io.github.tomaskul.springcheckyourworkstudentapi.model.AssignmentSummary;
import io.github.tomaskul.springcheckyourworkstudentapi.service.AssignmentInformationService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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

    @GetMapping(path = "/byId/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<Assignment> getById(@PathVariable UUID id){
        Assignment entity = assignmentInformationService.getById(id);
        if (entity == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @PostMapping(path = "/upload/{assignmentId}", consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
    @Operation(summary = "Upload assignment data.", description = "Upload multi-part file containing assignment answer(s).")
    public ResponseEntity<UUID> upload(@RequestBody MultipartFile uploadFile, @PathVariable UUID assignmentId){
        if (uploadFile == null || uploadFile.isEmpty()){
            throw new RelevantException();
        }
        return new ResponseEntity<>(assignmentId, HttpStatus.OK);
    }
}
