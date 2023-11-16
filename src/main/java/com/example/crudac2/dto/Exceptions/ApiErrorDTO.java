package com.example.crudac2.dto.Exceptions;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;

@Getter
public class ApiErrorDTO {

    private List<String> erros;

    public ApiErrorDTO(String msg) {
        this.erros = Arrays.asList(msg);
    }

}
