package com.MiTask.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MiTask.entity.Tarea;
import com.MiTask.repository.TareaRepository;

@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    public List<Tarea> alistatTareas(){
        return tareaRepository.findAll();
    }

    public Optional<Tarea> ObtenerTareas(Integer id){
        return tareaRepository.findById(id);
    }

    public Tarea guardarTareaId(Tarea ta){
        return tareaRepository.save(ta);
    }
}
