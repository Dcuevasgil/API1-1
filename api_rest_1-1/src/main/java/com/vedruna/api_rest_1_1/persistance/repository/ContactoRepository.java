package com.vedruna.api_rest_1_1.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedruna.api_rest_1_1.persistance.models.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {
    List<Contacto> getAllContactos();
    List<Contacto> findByAlumnoId(Long alumnoId);
    Contacto save(Long alumnoId);
    void updateContacto(Long id, String direccion, String telefono);
    void deleteContacto(Long id);
}
