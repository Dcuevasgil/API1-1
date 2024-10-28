package com.vedruna.api_rest_1_1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.api_rest_1_1.persistance.models.Alumno;
import com.vedruna.api_rest_1_1.persistance.models.Contacto;
import com.vedruna.api_rest_1_1.services.AlumnoServiceI;

@CrossOrigin // Permitir solicitudes de origen cruzado
@RestController
@RequestMapping("/api/alumnos") // Ruta base para los métodos del controlador
public class AlumnoController {

    @Autowired
    private AlumnoServiceI alumnoService; // Cambiado a AlumnoServiceI

    // 1. Consultar todos los alumnos (sin información de contacto)
    @GetMapping
    public List<Alumno> getAllAlumnos() {
        return alumnoService.findAllAlumnos(); // Devuelve la lista directamente
    }

    // 2. Consultar un solo alumno (sin información de contacto)
    @GetMapping("/{id}")
    public Alumno getAlumnoById(@PathVariable Long id) {
        return alumnoService.findAlumnoById(id); // Devuelve el alumno directamente
    }

    // 3. Consultar los datos de contacto de un alumno
    @GetMapping("/{id}/contacto")
    public Contacto getContactoByAlumnoId(@PathVariable Long alumnoId) {
        return alumnoService.findContactoByAlumnoId(alumnoId);
    }

    // 4. Crear nuevo alumno (con información de contacto)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // Establece el estado 201 Created
    public Alumno createAlumno(@RequestBody Alumno alumno) {
        return alumnoService.createAlumno(alumno); // Devuelve el alumno creado
    }

    // 5. Borrar alumno (y su información de contacto)
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // Establece el estado 204 No Content
    public void deleteAlumno(@PathVariable Long id) {
        alumnoService.deleteAlumno(id); // Solo ejecuta la eliminación
    }
}