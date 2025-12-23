package net.rku.opnv.studentticketapi.models;



import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Zustimmungen einer Person.")
public class Consent {

	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Kenntnisnahme der Datenschutzerklärung", example = "true")
	private boolean privacyPolicy;

	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Zustimmung zu Marketingmaßnahmen (Information und Eigenwerbung z.B. für neue Angebote für Schüler)", example = "true")
	private boolean marketing;


	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Zustimmung zu Markt- und Meinungsforschung (z.B. Teilnahme an Umfragen)", example = "true")
	private boolean marketResearch;
	
	
	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Zustimmung zur Kontaktierung per Telefon", example = "true")
	private boolean contactViaPhone;
	
	
	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Zustimmung zur Kontaktierung per Post", example = "true")
	private boolean contactViaMail;
	

	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Zustimmung zur Kontaktierung per E-Mail", example = "true")
	private boolean contactViaEMail;





}
