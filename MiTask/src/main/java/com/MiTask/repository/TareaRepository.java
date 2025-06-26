package com.MiTask.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MiTask.entity.Tarea;
import java.time.LocalDate;


@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long>{

    Optional<Tarea>  findById(Integer id);
    Optional<Tarea>  findByNombre(String nombre);
    Optional<Tarea>  findByDescripcion(String descripcion);
    Optional<Tarea>  findByPrioridad(String prioridad); 
    Optional<Tarea>  findByEstado(String estado);     
    Optional<Tarea>  findByFecha_vencimiento(LocalDate fecha_vencimiento);
}
