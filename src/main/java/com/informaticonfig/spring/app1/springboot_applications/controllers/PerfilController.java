package com.informaticonfig.spring.app1.springboot_applications.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PerfilController {

    @GetMapping("/materias")
    public List<Map<String, Object>> materias() {
        return List.of(
            Map.of("nombre", "Fundamentos de Telecomunicaciones", "creditos", 5),
            Map.of("nombre", "English B1M1", "creditos", 4),
            Map.of("nombre", "Programación Web", "creditos", 5)
        );
    }
}