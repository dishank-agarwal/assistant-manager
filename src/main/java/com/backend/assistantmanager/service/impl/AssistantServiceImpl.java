package com.backend.assistantmanager.service.impl;

import com.backend.assistantmanager.dto.AssistantDto;
import com.backend.assistantmanager.entity.Assistant;
import com.backend.assistantmanager.mapper.AssistantMapper;
import com.backend.assistantmanager.repository.AssistantRepository;
import com.backend.assistantmanager.service.AssistantService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class AssistantServiceImpl implements AssistantService {

    private AssistantRepository assistantRepository;

    public AssistantServiceImpl(AssistantRepository assistantRepository) {
        this.assistantRepository = assistantRepository;
    }

    @Override
    public AssistantDto createAssistant(AssistantDto assistantDto){

        Assistant assistant = AssistantMapper.mapToAssistant(assistantDto);
        Assistant savedAssistant = assistantRepository.save(assistant);

        return AssistantMapper.mapToAssistantDto(savedAssistant);
    }

    @Override
    public AssistantDto getAssistantById(Long id) {

        Assistant assistant = assistantRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("No assistant found!"));
        return AssistantMapper.mapToAssistantDto(assistant);
    }

    @Override
    public AssistantDto hike(Long id, Double hike) {

        Assistant assistant = assistantRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("No assistant found!"));

        Double inc_income = assistant.getSalary() + hike;

        assistant.setSalary(inc_income);
        Assistant savedAssistant = assistantRepository.save(assistant);

        return AssistantMapper.mapToAssistantDto(savedAssistant);
    }

    @Override
    public AssistantDto inHandSalary(Long id, Double salary) {

        Assistant assistant = assistantRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("No assistant found!"));

        if(assistant.getSalary() < 0){
            throw new RuntimeException("Invalid Salary Amount!");
        }

        if(assistant.getSalary() == salary){
            System.out.println("Your In-Hand salary will be 10% off from the offered CTC!");
        }

        Double inHandSalary = assistant.getSalary() - (0.1*salary);
        assistant.setSalary(inHandSalary);
        Assistant savedAssistant = assistantRepository.save(assistant);

        return AssistantMapper.mapToAssistantDto(savedAssistant);
    }

    @Override
    public List<AssistantDto> getAllAssistants() {

        List<Assistant> assistants = assistantRepository.findAll();

        return assistants.stream().map((assistant) -> AssistantMapper.mapToAssistantDto(assistant))
                .collect(Collectors.toList());

    }

    @Override
    public void deleteAssistant(Long id) {

        Assistant assistant = assistantRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("No assistant found!"));

        assistantRepository.deleteById(id);

    }


}
