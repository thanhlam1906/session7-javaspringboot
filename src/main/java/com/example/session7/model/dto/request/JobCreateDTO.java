package com.example.session7.model.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JobCreateDTO {
    @NotBlank(message = "Tiêu đề không được để trống")
    private String title;
    @Min(0)
    private Long salaryMin;
    @Min(0)
    private Long salaryMax;
    @Valid
    @NotNull(message = "Thông tin công ty không được để trống")
    private CompanyDTO company;
}

