package com.MiTask.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String rol;

    @OneToMany(mappedBy = "usuario",
    fetch = FetchType.LAZY,
    cascade =  CascadeType.All,
    orphanRemoval = true)
    @JsonBackReference
    List<Lista_de_usuarios_asignados_al_proyecto> lista_de_usuarios_asignados_al_proyectos;
}
