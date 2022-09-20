package net.rku.opnv.studentticketapi;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import net.rku.opnv.studentticketapi.control.SchoolDataController;
import net.rku.opnv.studentticketapi.exceptions.UnknownApiKeyException;
import net.rku.opnv.studentticketapi.models.Request;

@RestController
@Tag(name = "School Data API")
public class SchooldataapiRequests {

	@Autowired
	private SchoolDataController controler;

	Logger LOG = LoggerFactory.getLogger(SchooldataapiRequests.class);

	@ResponseStatus(code = HttpStatus.OK)
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "OK!", content = @Content),
			@ApiResponse(responseCode = "400", description = "Fehler bei der Validierung der Anfrage"),
			@ApiResponse(responseCode = "401", description = "API Key leer oder nicht angegeben"),
			@ApiResponse(responseCode = "403", description = "API Key nicht gefunden", content = {
					@Content(mediaType = "text/plain") }),
			@ApiResponse(responseCode = "405", description = "Anfrage muss ein POST-Request sein"),
			@ApiResponse(responseCode = "406", description = "Accept-Header kann nicht erfüllt werden"),
			@ApiResponse(responseCode = "415", description = "Content-Type wird nicht unterstützt"),
			@ApiResponse(responseCode = "500", description = "Interner Serverfehler"),
			@ApiResponse(responseCode = "502", description = "Bad Gateway"),
			@ApiResponse(responseCode = "503", description = "Service Unavailable"),
			@ApiResponse(responseCode = "504", description = "Gateway Timeout"), })
	@Schema(description = "Send School Data")
	@Operation(summary = "Übertragen eines Datensatzes an das Verkehrsunternehmen")
	@RequestMapping(value = "/api", 
					method = RequestMethod.POST, 
					consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, 
					produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<String> api(@Valid @RequestBody Request request,
			@Nullable @RequestHeader(value = "X-API-KEY") String apiKey) {
		// validateAPIKey(apiKey);

		controler.processRequest(request);

		LOG.info("Request processed successfully");
		LOG.debug(request.toString());

		return ResponseEntity.ok("Request processed successfully");
	}

	@SuppressWarnings("unused")
	private void validateAPIKey(String apikey) {
		if (apikey == null)
			throw new UnknownApiKeyException("X-API-KEY not provided");

		if (apikey.equals(""))
			throw new UnknownApiKeyException("X-API-KEY is empty");

		if (!apikey.equals("0m98b3v460itzjun"))
			throw new UnknownApiKeyException("X-API-KEY not found");
	}

}
