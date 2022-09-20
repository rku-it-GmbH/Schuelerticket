package net.rku.opnv.studentticketapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.FORBIDDEN)
public class UnknownApiKeyException extends RuntimeException {

	private static final long serialVersionUID = -7149219323984777011L;

	public UnknownApiKeyException(String message) {
		super(message);
		
		
	}
	
	
	



}
