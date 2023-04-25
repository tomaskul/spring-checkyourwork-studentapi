package io.github.tomaskul.springcheckyourworkstudentapi.controller;

import io.github.tomaskul.springcheckyourworkstudentapi.model.Assignment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping("/api/v1/assignments/")
public class AssignmentController {

    @GetMapping("/all")
    public ResponseEntity<Collection<Assignment>> getAll(){
        List<Assignment> assignments = new ArrayList<>();
        assignments.add(new Assignment());
        return new ResponseEntity<>(assignments, HttpStatus.OK);
    }

    @GetMapping("/byId/{id}")
    public ResponseEntity<Assignment> getById(@PathVariable String id){
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping("/upload/{assignmentId}")
    public ResponseEntity<UUID> upload(@RequestBody MultipartFile uploadFile, @PathVariable UUID assignmentId) {
        return new ResponseEntity<>(assignmentId, HttpStatus.OK);
    }
}
