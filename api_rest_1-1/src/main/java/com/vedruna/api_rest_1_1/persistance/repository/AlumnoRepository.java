package com.vedruna.api_rest_1_1.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vedruna.api_rest_1_1.persistance.models.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

    List<Alumno> getAllAlumnos(Long alumnoId);

    Alumno findAlumnoById(Long id);



    Alumno findByAlumnoName(String nombreAlumno);
    Alumno save(Alumno alumno);
    Alumno deleteAlumno(Long id);
    Alumno deleteAlumno(String nombreAlumno);
    Alumno updateAlumno(Long alumnoId, String nombreAlumno, String apellidosAlumno);

}