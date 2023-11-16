package com.example.crudac2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudac2.models.CategoriaCurso;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaCurso, Long> {
    Optional<CategoriaCurso> findByNome(String nome);
}
