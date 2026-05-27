package com.example.session7.service;

import com.example.session7.model.dto.request.CandidateCreateRequest;
import com.example.session7.model.entity.Candidate;

public interface CandidateService {
    Candidate createCandidate(CandidateCreateRequest request);
}
