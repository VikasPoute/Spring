package com.spring.search.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class MyExceptionHandller {

    // Central exception handler
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({ NullPointerException.class })
    public String nullExceptionHandller(Model model) {
        model.addAttribute("msg", "Null Pointer Exception has occurred");
        return "null_page";
    }

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({ NumberFormatException.class })
    public String numberFormatException(Model model) {
        model.addAttribute("msg", "Number Format Exception has occurred");
        return "null_page";
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public String exceptionHandllerGeneric(Model model) {
        model.addAttribute("msg", "Exception Occured");
        return "null_page";
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String error404(Model model) {
        model.addAttribute("msg", "404 Page Not Found");
        return "null_page";
    }
}
