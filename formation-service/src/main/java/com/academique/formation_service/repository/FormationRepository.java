package com.academique.formation_service.repository;

import com.academique.formation_service.model.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface FormationRepository extends JpaRepository<Formation, Long> {
}
