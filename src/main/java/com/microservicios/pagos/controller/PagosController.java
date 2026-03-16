package com.microservicios.pagos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.microservicios.pagos.model.Pagos;
import com.microservicios.pagos.service.PagosService;

@RestController
@RequestMapping("/pagos")
public class PagosController {

    private final PagosService service;

    public PagosController(PagosService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pagos> listarPagos() {
        return service.obtenerPagos();
    }

    @PostMapping
    public Pagos crearPago(@RequestBody Pagos pago) {
        return service.guardarPago(pago);
    }

}