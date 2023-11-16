package com.example.crudac2.mappers;

import com.example.crudac2.dto.CursoDTO;
import com.example.crudac2.dto.CursoInserirDTO;
import com.example.crudac2.models.CategoriaCurso;
import com.example.crudac2.models.Curso;

public class CursoMapper {

    public static CursoDTO convertCursoToDTO(Curso curso) {
        return new CursoDTO(curso.getId(),
                curso.getNome(),
                curso.getCargaHoraria(),
                curso.getCategoriaCurso().getNome());
    }

    public static Curso convertCursoDTOToEntity(CursoDTO cursoDTO, CategoriaCurso categoriaCurso) {
        return new Curso(cursoDTO.getId(),
                cursoDTO.getNome(),
                cursoDTO.getCargaHoraria(),
                categoriaCurso);
    }

    public static Curso convertCursoDTOToEntity(CursoDTO cursoDTO, CategoriaCurso categoriaCurso, Long id) {
        return new Curso(id,
                cursoDTO.getNome(),
                cursoDTO.getCargaHoraria(),
                categoriaCurso);
    }

    public static Curso convertCursoInserirDTOToEntity(CursoInserirDTO cursoDTO, CategoriaCurso categoriaCurso) {
        return new Curso(null,
                cursoDTO.getNome(),
                cursoDTO.getCargaHoraria(),
                categoriaCurso);
    }
}
