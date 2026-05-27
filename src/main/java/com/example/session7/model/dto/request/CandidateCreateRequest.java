package com.example.session7.model.dto.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CandidateCreateRequest {
    @NotBlank(message = "Ho ten khong duoc de trong")
    @Size(min = 5 , max = 50, message = "Do dai ten tu 2 - 50")
    private String fullName;
    @NotBlank(message = "Email khong duoc de trong")
    @Email(message = "Nhap dung dinh dang email")
    private String email;
    @Min(value = 18, message = "tuoi toi thieu 18 tuoi")
    private Long age;
    @Positive
    private Long yearsOfExperience;
}
