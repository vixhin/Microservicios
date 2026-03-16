package com.microservicios.pagos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservicios.pagos.model.Pagos;
import com.microservicios.pagos.repository.PagosRepository;

@Service
public class PagosService {

    private final PagosRepository repository;

    public PagosService(PagosRepository repository) {
        this.repository = repository;
    }

    public List<Pagos> obtenerPagos() {
        return repository.findAll();
    }

    public Pagos guardarPago(Pagos pago) {
        return repository.save(pago);
    }

}