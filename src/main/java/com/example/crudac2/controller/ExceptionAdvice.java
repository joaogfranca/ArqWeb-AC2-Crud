package com.example.crudac2.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.crudac2.dto.Exceptions.ApiErrorDTO;
import com.example.crudac2.exceptions.RegraException;

import org.springframework.http.HttpStatus;

@RestControllerAdvice
@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class ExceptionAdvice {

    @ExceptionHandler(RegraException.class)
    public ApiErrorDTO handleGeneralException(RegraException generalException) {
        String error = generalException.getMessage();
        return new ApiErrorDTO(error);
    }
}
