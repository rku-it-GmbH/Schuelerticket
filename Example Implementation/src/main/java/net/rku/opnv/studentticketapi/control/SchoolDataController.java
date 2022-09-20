package net.rku.opnv.studentticketapi.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.rku.opnv.studentticketapi.models.Request;

@Component
public class SchoolDataController {
	
	@Autowired
	private KVPSService kvps;
	
	@Autowired
	private RequestValidator validator;

	
	public void processRequest (Request rq) {
		validator.validateRequest(rq);
		kvps.sendData(rq);
	}
}
