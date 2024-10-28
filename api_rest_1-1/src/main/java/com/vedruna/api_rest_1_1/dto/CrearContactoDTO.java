package com.vedruna.api_rest_1_1.dto;

import com.vedruna.api_rest_1_1.persistance.models.Contacto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CrearContactoDTO {
    private String direccion;  // Dirección del contacto
    private String telefono;    // Teléfono del contacto
    private Long alumnosId;     // ID del alumno al que pertenece este contacto

    public CrearContactoDTO(Contacto con) {
        this.direccion = con.getDireccion();
        this.telefono = con.getTelefono();
        this.alumnosId = con.getAlumno().getIdalumno();
    }

}