package com.vedruna.api_rest_1_1.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@CrossOrigin // Permitir solicitudes de origen cruzado
@RestController
@RequestMapping("/test") // Ruta base para los métodos del controlador
public class MainController {

    // Método para probar la API
    @GetMapping("/") // Método GET para el endpoint "/test"
    public String test() {
        return "Hola mundo"; // Mensaje de prueba
    }
}
