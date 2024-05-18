package com.backend.assistantmanager.controller;


import com.backend.assistantmanager.dto.AssistantDto;
import com.backend.assistantmanager.service.AssistantService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/assistants")
public class AssistantController {

    private AssistantService assistantService;

    public AssistantController(AssistantService assistantService) {
        this.assistantService = assistantService;
    }

    // Adding Assistant REST API
    @PostMapping
    public ResponseEntity<AssistantDto> addAssistant(@RequestBody AssistantDto assistantDto){
        return new ResponseEntity<>(assistantService.createAssistant(assistantDto), HttpStatus.CREATED);
    }

    // Get Account REST API
    @GetMapping("/{id}")
    public ResponseEntity<AssistantDto> getAssistantById(@PathVariable Long id){

        AssistantDto assistantDto = assistantService.getAssistantById(id);

        return ResponseEntity.ok(assistantDto);
    }

    // Hike REST API
    @PutMapping("/{id}/hike")
    public ResponseEntity<AssistantDto> hike(@PathVariable Long id,
                                             @RequestBody Map<String, Double> request){

        Double hike = request.get("hike");

        AssistantDto assistantDto = assistantService.hike(id, hike);
        return ResponseEntity.ok(assistantDto);
    }

    // In Hand Salary REST API
    @PutMapping("/{id}/inHandSalary")
    public ResponseEntity<AssistantDto> inHandSalary(@PathVariable Long id,
                                                     @RequestBody Map<String, Double> request){
        Double inHandSalary = request.get("inHandSalary");

        AssistantDto assistantDto = assistantService.inHandSalary(id, inHandSalary);
        return ResponseEntity.ok(assistantDto);
    }

    // Get All Assistants REST API
    @GetMapping
    public ResponseEntity<List<AssistantDto>> getAllAssistants(){
        List<AssistantDto> assistants = assistantService.getAllAssistants();

        return ResponseEntity.ok(assistants);
    }

    // Delete Assistant REST API
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAssistant(@PathVariable Long id){
        assistantService.deleteAssistant(id);

        return ResponseEntity.ok("Assistant Deleted Successfully!");
    }

}
