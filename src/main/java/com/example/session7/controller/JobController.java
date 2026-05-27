package com.example.session7.controller;

import com.example.session7.model.dto.response.ApiResponse;
import com.example.session7.model.dto.request.JobCreateDTO;
import com.example.session7.service.JobServiceImpl;
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
    private final JobServiceImpl jobService;

    public JobController(JobServiceImpl jobService) {
        this.jobService = jobService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<JobCreateDTO>> createJob(@Valid @RequestBody JobCreateDTO request) {
        JobCreateDTO saved = jobService.createJob(request);
        ApiResponse<JobCreateDTO> response = new ApiResponse<>(
                true,
                "Job created successfully",
                saved,
                HttpStatus.OK
        );
        return ResponseEntity.ok(response);
    }
}
