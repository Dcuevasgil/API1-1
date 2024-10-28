package com.vedruna.api_rest_1_1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.api_rest_1_1.persistance.models.Alumno;
import com.vedruna.api_rest_1_1.persistance.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoServiceI {

    @Autowired
    private AlumnoRepository alumnoRepo;

    @Override
    public List<Alumno> getAllAlumnos(Long alumnoId) {
        return alumnoRepo.findAll();

    }

    @Override
    public List<Alumno> findAllAlumnos() {
        return alumnoRepo.findAll();

    }

    @Override
    public Alumno findAlumnoById(Long id) {
        return alumnoRepo.findAlumnoById(id);
    }

    @Override
    public Alumno findContactoByAlumnoId(Long alumnoId) {
        return alumnoRepo.findAlumnoById(alumnoId);
    }

    @Override
    public Alumno createAlumno(Alumno alumno) {
        return ((AlumnoServiceImpl) alumnoRepo).createAlumno(alumno);
    }

    @Override
    public void deleteAlumno(Long id) {
        alumnoRepo.deleteAlumno(id);
    }

    @Override
    public Alumno getByAlumnoName(String nombreAlumno) {
        return alumnoRepo.findByAlumnoName(nombreAlumno);
    }

    @Override
    public Alumno save(Alumno alumno) {
        return alumnoRepo.save(alumno);
    }

    @Override
    public Alumno deleteAlumno(String nombreAlumno) {
        return alumnoRepo.deleteAlumno(nombreAlumno);
    }

    @Override
    public Alumno updateAlumno(Long alumnoId, String nombreAlumno, String apellidosAlumno) {
        return alumnoRepo.updateAlumno(alumnoId, nombreAlumno, apellidosAlumno);
    }

    
}