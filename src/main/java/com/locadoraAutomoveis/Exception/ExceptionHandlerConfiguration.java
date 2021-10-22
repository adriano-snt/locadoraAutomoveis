package com.locadoraAutomoveis.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandlerConfiguration extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourcesNotFoundException.class)
    public final ResponseEntity resourceNotFound(ResourcesNotFoundException exception, final HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

}
