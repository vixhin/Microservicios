package com.microservicios.usuarios.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.microservicios.usuarios.model.Usuario;
import com.microservicios.usuarios.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return service.obtenerUsuarios();
    }

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return service.guardarUsuario(usuario);
    }
}