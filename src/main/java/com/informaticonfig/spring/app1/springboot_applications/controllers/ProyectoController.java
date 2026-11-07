package com.informaticonfig.spring.app1.springboot_applications.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectoController {

    @GetMapping("/proyecto")
    public String proyecto() {
        return "Proyecto: CEHG_act1_t4_Spring - Autor: Concepcion Escarleth Hernandez Guzman";
    }

    @GetMapping("/estado")
    public Map<String, Object> estado() {
        return Map.of(
            "estado", "activo",
            "puerto", 8081,
            "version", "0.0.1"
        );
    }
}