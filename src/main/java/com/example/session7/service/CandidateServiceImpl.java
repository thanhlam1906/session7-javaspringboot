package com.example.session7.service;

import com.example.session7.mapper.CandidateMapper;
import com.example.session7.model.dto.request.CandidateCreateRequest;
import com.example.session7.model.entity.Candidate;
import com.example.session7.repository.ICandidateRepository;
import org.springframework.stereotype.Service;

@Service
public class CandidateServiceImpl implements CandidateService{
    private final CandidateMapper candidateMapper;
    private final ICandidateRepository candidateRepository;

    public CandidateServiceImpl(CandidateMapper candidateMapper, ICandidateRepository candidateRepository) {
        this.candidateMapper = candidateMapper;
        this.candidateRepository = candidateRepository;
    }

    @Override
    public Candidate createCandidate(CandidateCreateRequest request) {
        Candidate candidate = candidateMapper.toEntity(request);
        System.out.println(candidate);

        Candidate saved = candidateRepository.save(candidate);
        return saved;
    }
}
