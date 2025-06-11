package com.ProyectoNaval.ProyectoNaval.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class HealthController {

    @GetMapping("/health")
    public Map<String, Object> health() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "UP");
        response.put("timestamp", LocalDateTime.now());
        response.put("service", "Proyecto Naval Backend");
        response.put("version", "1.0.0");
        response.put("platform", "Render.com");
        return response;
    }
    
    @GetMapping("/")
    public Map<String, Object> welcome() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Proyecto Naval API");
        response.put("status", "Running");
        response.put("endpoints", Map.of(
            "health", "/api/health",
            "vessels", "/api/vessels"
        ));
        return response;
    }
}