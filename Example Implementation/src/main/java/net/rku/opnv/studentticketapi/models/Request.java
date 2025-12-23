package net.rku.opnv.studentticketapi.models;

import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.validation.Valid;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {

	@Valid
	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Basisdaten des Antrags")
	private BasicData basicData;
	
	@Valid
	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Informationen die für die Ausstellung des Tickets benötigt werden")
	private TicketInformation ticketInformation;


	@Valid
	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Kontaktdaten des Schülers")
	private Contact student;

	@Valid
	@Nullable
	@Schema(description = "Kontaktdaten des gesetzlichen Vertreters des Schülers (Erziehungsberechtigter/Sorgeberechtigter/Vormund). " +
				"Bei minderjährigen Schülern ist die Angabe eines gesetzlichen Vertreters verpflichtend. " +
				"Bei geteiltem Sorgerecht benötigt das Verkehrsunternehmen einen eindeutigen Ansprechpartner. Es kann darum nur ein gesetzlicher Vertreter angegeben werden." )
	private Contact representative;
	
	@Valid
	@Nullable
	@Schema(description = "Informationen zur Zahlung des Tickets")
	private PaymentDetails paymentDetails;
	
	
	@Valid
	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Diverse Einwilligungen des Schülers/gesetzlichen Vertreters")
	private Consent consent;

	@Valid
	@Nullable
	@Schema(description = "Informationen zur Schule, die der Schüler besucht")
	private SchoolInformation schoolInformation;



	@Valid
	@Nullable
	@Schema(description = "Geschwister des Schülers." + 
				"Diese Daten sind für die Prüfung auf anspruchsberechtigte Geschwister nötig. " + 
				"Grundsätzlich sind die Schulträger für die Prüfung verantwortlich. Diese wird aber meist nur bei kommunalen Trägern und nur für die eigenen Schulen durchgeführt (und nicht für andere Schulträger oder Kommunen). " +
				"Die Angabe ist nur erforderlich, falls das Verkehrsunternehmen selbst eine Prüfung der Geschwister durchführt.")
	private List<Sibling> siblings;

}
