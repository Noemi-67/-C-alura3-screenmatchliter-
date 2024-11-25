package com.litercuartointento.screenmatchliter.repository;

import com.litercuartointento.screenmatchliter.model.Libros;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILibrosRepository extends JpaRepository<Libros, Long> {
    Libros findByTitulo (String titulo);
    List<Libros> findByIdiomasContaining(String idiomas);
}
