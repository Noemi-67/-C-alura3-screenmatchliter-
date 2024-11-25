package com.litercuartointento.screenmatchliter.repository;

import com.litercuartointento.screenmatchliter.model.Autores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAutoresRepository extends JpaRepository<Autores, Long> {
    Autores findByNameIgnoreCase(String nombre);
    List<Autores> findByFechaDeNacimientoLessThanEqualAndFechaDeFallecimientoGreaterThanEqual(int anoInicial, int anoFinal);
}

