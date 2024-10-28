package com.vedruna.api_rest_1_1.dto;

import com.vedruna.api_rest_1_1.persistance.models.Contacto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ContactoDTO {
    private Long idinfocontacto; // ID del contacto
    private String direccion; // Dirección del contacto
    private String telefono; // Teléfono del contacto
    private Long alumnosId; // ID del alumno asociado

    public ContactoDTO(Contacto con) {
        this.idinfocontacto = con.getIdinfocontacto();
        this.direccion = con.getDireccion();
        this.telefono = con.getTelefono();
    }
}