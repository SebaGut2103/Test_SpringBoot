package com.MiTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MiTask.entity.Proyecto;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long>{

    
}
