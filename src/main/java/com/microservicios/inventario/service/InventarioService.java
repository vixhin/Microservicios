package com.microservicios.inventario.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservicios.inventario.model.Producto;
import com.microservicios.inventario.repository.InventarioRepository;

@Service
public class InventarioService {

    private final InventarioRepository repository;

    public InventarioService(InventarioRepository repository) {
        this.repository = repository;
    }

    public List<Producto> obtenerProductos() {
        return repository.findAll();
    }

    public Producto guardarProducto(Producto producto) {
        return repository.save(producto);
    }

    public void eliminarProducto(Long id) {
        repository.deleteById(id);
    }
}