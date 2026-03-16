package com.microservicios.inventario.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.microservicios.inventario.model.Producto;
import com.microservicios.inventario.service.InventarioService;

@RestController
@RequestMapping("/inventario")
public class InventarioController {

    private final InventarioService service;

    public InventarioController(InventarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Producto> listarProductos() {
        return service.obtenerProductos();
    }

    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        return service.guardarProducto(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        service.eliminarProducto(id);
    }
}