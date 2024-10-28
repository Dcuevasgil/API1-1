package com.vedruna.api_rest_1_1.dto;

import com.vedruna.api_rest_1_1.persistance.models.Alumno;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AlumnoDTO {
    private Long idalumno; // ID del alumno
    private String nombre;  // Nombre del alumno
    private String apellidos; // Apellidos del alumno

    public AlumnoDTO(Alumno al) {
        this.idalumno = al.getIdalumno();        
        this.nombre = al.getNombre();
        this.apellidos = al.getApellidos();
    }
}