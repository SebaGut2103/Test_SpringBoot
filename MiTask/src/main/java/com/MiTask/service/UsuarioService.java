package com.MiTask.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MiTask.entity.Usuario;
import com.MiTask.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> alistaUsuarios(){
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> ObtenerUsuario(Integer id){
        return usuarioRepository.findById(id);
    }

    public Usuario guardarUsuarioId(Usuario us){
        return usuarioRepository.save(us);
    }
    
}
