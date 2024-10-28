package com.vedruna.api_rest_1_1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.api_rest_1_1.persistance.models.Contacto;
import com.vedruna.api_rest_1_1.persistance.repository.ContactoRepository;

@Service
public class ContactoServiceImpl implements ContactoServiceI {

    @Autowired
    ContactoRepository contactoRepo;

    @Override
    public List<Contacto> getAllContactos() {
        return contactoRepo.findAll();
    }

    @Override
    public List<Contacto> findAllContactos() {
        return contactoRepo.findAll();
    }

    @Override
    public List<Contacto> findByAlumnoId(Long id) {
        return contactoRepo.findByAlumnoId(id);
    }

    @Override
    public Contacto save(Contacto contacto) {
        return contactoRepo.save(contacto);
    }

    @Override
    public void updateContacto(Long id, String direccion, String telefono) {
        contactoRepo.updateContacto(id, direccion, telefono);
    }

    @Override
    public void deleteContacto(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteContacto'");
    }

    
    
}