package com.MiTask.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MiTask.entity.Lista_de_usuario_asignado_tarea;
import com.MiTask.entity.Tarea;
import com.MiTask.entity.Usuario;

@Repository
public interface ListaUsuario_TareaReporitory extends JpaRepository<Lista_de_usuario_asignado_tarea,Long>{

    Optional<Lista_de_usuario_asignado_tarea> findById(Integer id);
    Optional<Lista_de_usuario_asignado_tarea> findByTarea(Tarea tarea);
    Optional<Lista_de_usuario_asignado_tarea> findByUsuario(Usuario usuario);
}
