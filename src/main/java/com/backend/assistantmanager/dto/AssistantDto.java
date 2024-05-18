package com.backend.assistantmanager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AssistantDto {
    private Long id;
    private String name;
    private String email, city, country, department, role, mobile;
    private Double salary;
}
