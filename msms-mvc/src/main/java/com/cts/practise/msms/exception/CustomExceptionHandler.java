package com.cts.practise.msms.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Controller
@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public String handleAllExceptions(Exception ex, WebRequest web, Model model) {
		ErrorResponse errorResponse = new ErrorResponse(new Date(), ex.getMessage(), web.getDescription(false));
		model.addAttribute("error", errorResponse);
		return "error";
	}

	@ExceptionHandler(ResourceNotFoundException.class)
	public String handleUserNotFound(Exception ex, WebRequest web, Model model) {
		ErrorResponse errorResponse = new ErrorResponse(new Date(), ex.getMessage(), web.getDescription(false));
		model.addAttribute("error", errorResponse);
		return "error";
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(new Date(), "Validation Failed",
				ex.getBindingResult().toString());
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}

}
