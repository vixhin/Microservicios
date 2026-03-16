package com.microservicios.usuarios.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.microservicios.usuarios.model.Usuario;
import com.microservicios.usuarios.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> obtenerUsuarios() {
        return repository.findAll();
    }

    public Usuario guardarUsuario(Usuario usuario) {
        return repository.save(usuario);
    }
}