package com.example.test_shop.advices;

import com.example.test_shop.exceptions.ProductException;
import com.example.test_shop.exceptions.ProductTypeException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = {ProductException.class, ProductTypeException.class})
    ResponseEntity<Object> handleError(RuntimeException ex, WebRequest request){
        return handleExceptionInternal(ex, ex.getMessage(), new HttpHeaders(), HttpStatus.CONFLICT, request);
    }
}
