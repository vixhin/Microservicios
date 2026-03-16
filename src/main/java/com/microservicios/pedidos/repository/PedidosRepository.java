package com.microservicios.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.microservicios.pedidos.model.Pedidos;

public interface PedidosRepository extends JpaRepository<Pedidos, Long> {

}