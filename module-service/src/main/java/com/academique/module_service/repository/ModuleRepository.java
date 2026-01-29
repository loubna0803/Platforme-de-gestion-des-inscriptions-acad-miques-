package com.academic.module_service.repository;

import com.academic.module_service.model.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional; 


@Repository
public interface ModuleRepository extends JpaRepository<Module, Long> {
        Optional<Module> findByTitle(String title);

}
