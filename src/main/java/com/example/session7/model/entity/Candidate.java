package com.example.session7.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "candidate")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "full_name",nullable = false)
    private String fullName;
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "age", nullable = false)
    private Long age;
    @Column(name = "yoe", nullable = false)
    private Long yearsOfExperience;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "bio", nullable = true)
    private String bio;
    @Column(name = "phone", nullable = true)
    private String phone;}
