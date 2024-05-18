package com.backend.assistantmanager.service;

import com.backend.assistantmanager.dto.AssistantDto;

import java.util.List;

public interface AssistantService {

    AssistantDto createAssistant(AssistantDto assistantDto);

    AssistantDto getAssistantById(Long id);

    AssistantDto hike(Long id, Double salary);

    AssistantDto inHandSalary(Long id, Double salary);

    List<AssistantDto> getAllAssistants();

    void deleteAssistant(Long id);

}
