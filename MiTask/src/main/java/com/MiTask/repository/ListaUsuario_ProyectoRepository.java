package com.MiTask.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MiTask.entity.Lista_de_tareas_asignadas_por_proyecto;
import com.MiTask.entity.Lista_de_usuarios_asignados_al_proyecto;
import com.MiTask.entity.Proyecto;
import com.MiTask.entity.Usuario;



@Repository
public interface ListaUsuario_ProyectoRepository extends JpaRepository<Lista_de_usuarios_asignados_al_proyecto,Long>{

    Optional<Lista_de_usuarios_asignados_al_proyecto> findById(Integer id);
    Optional<Lista_de_tareas_asignadas_por_proyecto> findByProyecto(Proyecto proyecto);
    Optional<Lista_de_tareas_asignadas_por_proyecto>  findByUsuario(Usuario usuario);

}
