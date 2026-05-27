package com.example.session7.service;

import com.example.session7.model.dto.request.JobCreateDTO;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl {
    public JobCreateDTO createJob(JobCreateDTO dto) {
        if (dto.getSalaryMin() > dto.getSalaryMax()) {
            throw new IllegalArgumentException("Lương tối thiểu không được lớn hơn lương tối đa");
        }

        return dto;
    }
}
