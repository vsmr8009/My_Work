package com.cts.training.sb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class SkillNotFoundException extends RuntimeException{
	
	public SkillNotFoundException(String message) {
		super(message);
	}

}
