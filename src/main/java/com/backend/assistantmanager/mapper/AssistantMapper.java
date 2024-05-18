package com.backend.assistantmanager.mapper;

import com.backend.assistantmanager.dto.AssistantDto;
import com.backend.assistantmanager.entity.Assistant;

public class AssistantMapper {

    public static Assistant mapToAssistant(AssistantDto assistantDto){
        Assistant assistant = new Assistant(
          assistantDto.getId(),
          assistantDto.getName(),
          assistantDto.getEmail(),
          assistantDto.getCity(),
          assistantDto.getCountry(),
          assistantDto.getDepartment(),
          assistantDto.getRole(),
          assistantDto.getMobile(),
          assistantDto.getSalary()
        );
        return assistant;
    }

    public static AssistantDto mapToAssistantDto(Assistant assistant){
        AssistantDto assistantDto = new AssistantDto(
                assistant.getId(),
                assistant.getName(),
                assistant.getEmail(),
                assistant.getCity(),
                assistant.getCountry(),
                assistant.getDepartment(),
                assistant.getRole(),
                assistant.getMobile(),
                assistant.getSalary()
        );
        return assistantDto;
    }

}
