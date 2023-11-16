package com.example.crudac2.service.repository;

import java.util.List;

import com.example.crudac2.dto.CategoriaCursoDTO;
import com.example.crudac2.dto.CategoriaInserirDTO;

public interface CategoriaCursoInterface {
    List<CategoriaCursoDTO> obterTodos();

    CategoriaInserirDTO inserir(CategoriaInserirDTO categoriaCursoDTO);

    CategoriaCursoDTO obterPorId(Long id);

    CategoriaCursoDTO editar(Long id, CategoriaCursoDTO categoriaCursoDTO);

    void excluir(Long id);
}
