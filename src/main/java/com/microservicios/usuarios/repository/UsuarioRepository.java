package com.microservicios.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.microservicios.usuarios.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}