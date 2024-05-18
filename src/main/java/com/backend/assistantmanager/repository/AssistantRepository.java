package com.backend.assistantmanager.repository;

import com.backend.assistantmanager.entity.Assistant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssistantRepository extends JpaRepository<Assistant, Long> {
}
