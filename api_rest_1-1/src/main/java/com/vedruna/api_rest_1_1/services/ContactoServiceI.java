package com.vedruna.api_rest_1_1.services;

import java.util.List;

import com.vedruna.api_rest_1_1.persistance.models.Contacto;

public interface ContactoServiceI {

    List<Contacto> getAllContactos();

    List<Contacto> findAllContactos();

    List<Contacto> findByAlumnoId(Long id);

    Contacto save(Contacto contacto);

    void updateContacto(Contacto contacto);

    void deleteContacto(Long id);
}