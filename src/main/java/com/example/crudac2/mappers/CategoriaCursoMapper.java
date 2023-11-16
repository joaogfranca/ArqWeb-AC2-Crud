package com.example.crudac2.mappers;

import com.example.crudac2.dto.CategoriaCursoDTO;
import com.example.crudac2.dto.CategoriaInserirDTO;
import com.example.crudac2.models.CategoriaCurso;

public class CategoriaCursoMapper {

    public static CategoriaCursoDTO convertCategoriaToDTO(CategoriaCurso categoria) {
        return new CategoriaCursoDTO(categoria.getId(),
                categoria.getNome());
    }

    public static CategoriaCurso convertCategoriaDTOToEntity(CategoriaCursoDTO categoria) {
        return new CategoriaCurso(categoria.getId(),
                categoria.getNome(),
                null);
    }

    public static CategoriaCurso convertCategoriaDTOToEntity(CategoriaCursoDTO categoria, Long id,
            CategoriaCurso categoriaCurso) {
        return new CategoriaCurso(id,
                categoria.getNome(),
                categoriaCurso.getCursos());
    }

    public static CategoriaCurso convertCategoriaInserirDTOToEntity(CategoriaInserirDTO categoria) {
        return new CategoriaCurso(null,
                categoria.getNome(),
                null);
    }
}
