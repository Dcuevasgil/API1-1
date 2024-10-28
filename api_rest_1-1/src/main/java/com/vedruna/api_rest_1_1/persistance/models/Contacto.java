package com.vedruna.api_rest_1_1.persistance.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "infocontacto") // Nombre de la tabla en la base de datos
public class Contacto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idinfocontacto")
    private Long idinfocontacto; // ID del contacto

    @Column(name = "direccion")
    private String direccion; // Dirección del contacto

    @Column(name = "telefono")
    private String telefono; // Teléfono del contacto

    @ManyToOne // Relación muchos a uno con Alumno
    @JoinColumn(name = "alumnos_idalumno", nullable = false) // Columna que relaciona con la tabla Alumno
    private Alumno alumno; // Relación con el objeto Alumno
}