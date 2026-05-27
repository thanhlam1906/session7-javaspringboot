package com.example.session7.mapper;

import com.example.session7.model.dto.request.CandidateCreateRequest;
import com.example.session7.model.entity.Candidate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CandidateMapper {
    //request -> entity
    Candidate toEntity(CandidateCreateRequest candidateCreateRequest);
}
