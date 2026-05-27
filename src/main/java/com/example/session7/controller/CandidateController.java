package com.example.session7.controller;

import com.example.session7.model.dto.request.CandidateCreateRequest;
import com.example.session7.model.dto.response.ApiResponse;
import com.example.session7.model.entity.Candidate;
import com.example.session7.service.CandidateService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/candidates")
public class CandidateController {
    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @PostMapping
    private ResponseEntity<ApiResponse<Candidate>> createCandidate(@Valid @RequestBody CandidateCreateRequest request) {
        Candidate candidate = candidateService.createCandidate(request);
        return new ResponseEntity<>(new ApiResponse<>(true,"create successfully",candidate, HttpStatus.CREATED), HttpStatus.CREATED) ;
    }
}
