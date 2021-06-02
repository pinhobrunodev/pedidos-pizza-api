package com.pinhobrunodev.pizzariawebservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandlers extends ResponseEntityExceptionHandler{
    

    @ExceptionHandler(ExceptionBusiness.class)
    protected ResponseEntity<ExceptionResponse> emailAlreadyInUseExceptionHandler(ExceptionBusiness e){
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(new ExceptionResponse(e.getMessage()));
    }
    @ExceptionHandler(ExceptionNotFound.class)
    protected ResponseEntity<ExceptionResponse> emailAlreadyInUseExceptionHandler(ExceptionNotFound e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionResponse(e.getMessage()));
    }
    
    
    


}
