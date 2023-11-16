package com.example.crudac2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudac2.models.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    List<Curso> findByNomeLike(String nome);
}
