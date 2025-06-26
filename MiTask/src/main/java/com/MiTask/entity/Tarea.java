package com.MiTask.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "tarea")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "prioridad", nullable = false)
    private String prioridad;

    @Column(name = "estado", nullable = false)
    private String estado;

    @Column(name = "fecha_vencimiento", nullable = false)
    private LocalDate fecha_vencimiento;


    @OneToMany(mappedBy = "tarea",
    fetch = FetchType.LAZY,
    cascade =  CascadeType.ALL,
    orphanRemoval = true)
    @JsonBackReference
    List<Lista_de_usuario_asignado_tarea> lista_de_usuario_asignado_tareas;
}
