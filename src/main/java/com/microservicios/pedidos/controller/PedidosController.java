package com.microservicios.pedidos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.microservicios.pedidos.model.Pedidos;
import com.microservicios.pedidos.service.PedidosService;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {

    private final PedidosService service;

    public PedidosController(PedidosService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pedidos> listarPedidos() {
        return service.obtenerPedidos();
    }

    @PostMapping
    public Pedidos crearPedido(@RequestBody Pedidos pedido) {
        return service.guardarPedido(pedido);
    }
}