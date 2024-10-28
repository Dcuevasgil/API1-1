package com.vedruna.api_rest_1_1.services;

import java.util.List;


import com.vedruna.api_rest_1_1.persistance.models.Alumno;
import com.vedruna.api_rest_1_1.persistance.models.Contacto;

public interface AlumnoServiceI {

    List<Alumno> getAllAlumnos(Long alumnoId);

    List<Alumno> findAllAlumnos();

    Alumno findAlumnoById(Long id);

    Alumno findContactoByAlumnoId(Long alumnoId);

    Alumno createAlumno(Alumno alumno);

    void deleteAlumno(Long id);

    Alumno getByAlumnoName(String nombreAlumno);

    Alumno save(Alumno alumno);

    Alumno deleteAlumno(String nombreAlumno);

    Alumno updateAlumno(Long alumnoId, String nombreAlumno, String apellidosAlumno);
}