package com.example.session7.controller;

import com.example.session7.model.dto.request.CandidateCreateRequest;
import com.example.session7.model.dto.response.ApiResponse;
import com.example.session7.model.entity.Candidate;
import com.example.session7.service.CandidateService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/candidates")
public class CandidateController {
    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<Candidate>> createCandidate(@Valid @RequestBody CandidateCreateRequest request) {
        Candidate candidate = candidateService.createCandidate(request);
        return new ResponseEntity<>(new ApiResponse<>(true, "create successfully", candidate, HttpStatus.CREATED),
                HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<Candidate>> updateCandidate(@PathVariable Long id,
            @ModelAttribute CandidateCreateRequest request) {
        Candidate candidate = candidateService.updateCandidate(id, request);
        return new ResponseEntity<>(new ApiResponse<>(true, "update successfully", candidate, HttpStatus.OK),
                HttpStatus.OK);
    }
}