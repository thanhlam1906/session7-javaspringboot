package com.example.session7.model.dto.request;

import jakarta.persistence.Column;
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
    @Size(min = 2 , max = 50, message = "Do dai ten tu 2 - 50")
    private String fullName;
    @NotBlank(message = "Email khong duoc de trong")
    @Email(message = "Nhap dung dinh dang email")
    private String email;
    @Min(value = 18, message = "tuoi toi thieu 18 tuoi")
    private Long age;
    @Positive
    private Long yearsOfExperience;
    @NotBlank(message = "Dia chi khong duoc bo trong")
    private String address;
    @Size (min = 0 , max = 200, message = "toi da 200 ki tu")
    private String bio;
    @NotBlank(message = "So dien thoai khong duoc de trong")
    @Pattern(
            regexp = "^(0[3|5|7|8|9])[0-9]{8}$",
            message = "Số điện thoại không hợp lệ"
    )
    private String phone;
}
