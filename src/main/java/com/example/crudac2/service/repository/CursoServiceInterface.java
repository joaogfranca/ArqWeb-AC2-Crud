package com.example.crudac2.service.repository;

import java.util.List;

import com.example.crudac2.dto.CursoDTO;
import com.example.crudac2.dto.CursoInserirDTO;

public interface CursoServiceInterface {
    List<CursoDTO> obterTodos();

    CursoInserirDTO inserir(CursoInserirDTO cursoDTO);

    CursoDTO obterPorId(Long id);

    CursoDTO editar(Long id, CursoDTO cursoDTO);

    void excluir(Long id);
}
