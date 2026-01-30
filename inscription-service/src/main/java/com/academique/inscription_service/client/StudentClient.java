package com.academique.inscription_service.client;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "student-service")
public interface StudentClient {

    @GetMapping("/students/{id}")
    @CircuitBreaker(name = "studentService", fallbackMethod = "fallback")
    Object getStudent(@PathVariable Long id);

    default Object fallback(Long id, Throwable t) {
        return null;
    }
}
