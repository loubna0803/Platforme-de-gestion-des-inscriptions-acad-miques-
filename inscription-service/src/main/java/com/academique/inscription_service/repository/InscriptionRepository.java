package com.academique.inscription_service.repository;

import com.academique.inscription_service.model.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
}
