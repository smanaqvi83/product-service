package com.adidas.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerClass {

    @ExceptionHandler({ Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleGenericException(Exception ex) {
        return (new ErrorResponse.ErrorResponseBuilder()).description(ex.getLocalizedMessage()).errorCode("500").build();
    }

    @ExceptionHandler({ ProductException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleGenericException(ProductException ex) {
        return (new ErrorResponse.ErrorResponseBuilder()).description(ex.getLocalizedMessage()).errorCode("400").build();
    }

}
