package com.example.session7.service;

import com.example.session7.mapper.CandidateMapper;
import com.example.session7.model.dto.request.CandidateCreateRequest;
import com.example.session7.model.entity.Candidate;
import com.example.session7.repository.ICandidateRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

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
    @Override
    public Candidate updateCandidate(Long id, CandidateCreateRequest request) {
        Candidate candidate = candidateRepository.findById(id).orElseThrow(()-> new NoSuchElementException("Khong ton tai id "+ id));
        candidate.setFullName(request.getFullName());
        candidate.setEmail(request.getEmail());
        candidate.setAddress(request.getAddress());
        candidate.setBio(request.getBio());
        candidate.setAge(request.getAge());
        candidate.setYearsOfExperience(request.getYearsOfExperience());
        Candidate saved =candidateRepository.save(candidate);
        return saved;
    }
}
