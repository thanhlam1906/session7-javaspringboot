package com.example.session7.controller;

import com.example.session7.model.dto.response.ApiResponse;
import com.example.session7.model.dto.request.JobCreateDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @PostMapping
    public ResponseEntity<ApiResponse<JobCreateDTO>> createJob(@Valid @RequestBody JobCreateDTO request) {
        ApiResponse<JobCreateDTO> response = new ApiResponse<>(
                true,
                "Job created successfully",
                request,
                HttpStatus.OK
        );
        return ResponseEntity.ok(response);
    }
}
