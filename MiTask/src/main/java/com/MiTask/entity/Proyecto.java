package com.MiTask.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
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
@AllArgsConstructor
@Data
@Table(name = "proyecto")
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String rol;

    @OneToMany(mappedBy = "tarea",
    fetch = FetchType.LAZY,
    cascade =  CascadeType.ALL,
    orphanRemoval = true)
    @JsonBackReference
    List<Lista_de_tareas_asignadas_por_proyecto> lista_de_tareas_asignadas_por_proyectos;
}
