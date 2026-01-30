package com.academique.inscription_service.client;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "module-service")
public interface ModuleClient {

    @GetMapping("/modules/{id}")
    @CircuitBreaker(name = "moduleService", fallbackMethod = "fallback")
    Object getModule(@PathVariable Long id);

    default Object fallback(Long id, Throwable t) {
        return null;
    }
}
