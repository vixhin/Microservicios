package com.microservicios.pagos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.microservicios.pagos.model.Pagos;

public interface PagosRepository extends JpaRepository<Pagos, Long> {

}