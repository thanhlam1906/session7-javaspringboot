package com.example.session7.model.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CompanyDTO {
    @NotBlank(message = "Tên công ty không được để trống")
    private String name;

    @Size(min = 10, max = 13, message = "Mã số thuế phải từ 10 đến 13 ký tự")
    private String taxCode;
}

