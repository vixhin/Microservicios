package com.microservicios.pedidos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservicios.pedidos.model.Pedidos;
import com.microservicios.pedidos.repository.PedidosRepository;

@Service
public class PedidosService {

    private final PedidosRepository repository;

    public PedidosService(PedidosRepository repository) {
        this.repository = repository;
    }

    public List<Pedidos> obtenerPedidos() {
        return repository.findAll();
    }

    public Pedidos guardarPedido(Pedidos pedido) {
        return repository.save(pedido);
    }
}