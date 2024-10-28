package com.vedruna.api_rest_1_1.dto;



import com.vedruna.api_rest_1_1.persistance.models.Alumno;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CrearAlumnoDTO {

    private Long alumnoId;
    private String nombreAlumno;
    private String apellidosAlumno;

    public CrearAlumnoDTO(Alumno al) {
        this.alumnoId = al.getIdalumno();
        this.nombreAlumno = al.getNombre();
        this.apellidosAlumno = al.getApellidos();
    }
}
