package com.microservicios.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.microservicios.inventario.model.Producto;

public interface InventarioRepository extends JpaRepository<Producto, Long> {
}