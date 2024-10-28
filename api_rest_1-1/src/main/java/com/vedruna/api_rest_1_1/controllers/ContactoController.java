package com.vedruna.api_rest_1_1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.api_rest_1_1.persistance.models.Contacto;
import com.vedruna.api_rest_1_1.services.ContactoServiceI;

@CrossOrigin // Permitir solicitudes de origen cruzado
@RestController
@RequestMapping("/api/contactos") // Ruta base para los métodos del controlador
public class ContactoController {

    @Autowired
    ContactoServiceI contactoService; // Cambiado a ContactoServiceI

    // 1. Consultar todos los contactos
    @GetMapping
    public List<Contacto> getAllContactos() {
        return contactoService.findAllContactos();
    }

    // 2. Consultar un solo contacto
    @GetMapping("/{id}")
    public Contacto getContactoByAlumnoId(@PathVariable Long id) {
        return contactoService.findByAlumnoId(id);
    }

    // 2. Crear un nuevo contacto
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Contacto save(@RequestBody Contacto contacto) {
        return contactoService.save(contacto);
    }

    // 3. Actualizar un contacto
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateContacto(@PathVariable Long id, @RequestBody Contacto contacto) {
        contactoService.updateContacto(contacto);
    }

    // 4. Borrar un contacto
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteContacto(@PathVariable Long id) {
        contactoService.deleteContacto(id);
    }
}