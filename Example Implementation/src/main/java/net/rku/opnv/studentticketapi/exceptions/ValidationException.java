package net.rku.opnv.studentticketapi.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class ValidationException extends RuntimeException {


	private static final long serialVersionUID = 3275009882600722790L;
	
	private Logger LOG = LoggerFactory.getLogger(ValidationException.class);

	public ValidationException(String errorMessage) {
	    super(errorMessage);
	    LOG.error(errorMessage);
	}

}
