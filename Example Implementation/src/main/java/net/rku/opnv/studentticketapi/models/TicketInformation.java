package net.rku.opnv.studentticketapi.models;

import java.time.LocalDate;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.rku.opnv.studentticketapi.models.enums.Medium;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketInformation {

		
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Zustimmung Tarifgrundlagen erteilt", example = "true")
	private boolean acceptTariffregulations;

	@Nullable
	@Schema(description = "Schuljahres-Beginn", example = "2023-05-21")
	private LocalDate schoolYearStart;

	@Nullable
	// @Future
	@Schema(description = "Schuljahres-Ende", example = "2022-08-01")
	private LocalDate schoolYearEnd;

	@Nonnull
	// @Future
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Abo-Beginn", example = "2023-05-21")
	private LocalDate subscriptionStart;

	@Nullable
	// @Future
	@Schema(description = "Abo-Ende", example = "2022-08-01")
	private LocalDate subscriptionEnd;

	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Verkehrsverbund", example = "AVV")
	private String transportAssociation;

	@Nullable
	@Schema(description = "Verkehrsunternehmen", example = "BOGESTRA")
	private String transportCompany;

	@Nullable
	@Schema(description = "Produkt", example = "Schokoticket")
	private String product;

	@Nullable
	@Schema(description = "Produktnummer", example = "691581")
	private String productNumber;

	@Nullable
	@Schema(description = "Preisstufe", example = "A3")
	private String priceLevel;

	@Nullable
	@Schema(description = "Starthaltestelle", example = "Bochum, Jahrhunderthalle")
	private String startingStop;

	@Nullable
	@Schema(description = "Über Haltestelle", example = "Bochum, Jahrhunderthalle")
	private String viaStop;

	@Nullable
	@Schema(description = "Zielhaltestelle", example = "Herne, Berliner Platz")
	private String destinationStop;

	@Nullable
	@Schema(description = "Geltungsbereich", example = "Wabe 615")
	private String validityAreaSchool;

	@Nullable
	@Schema(description = "Geltungsbereich beim Zukauf von Freizeitnutzung", example = "Wabe 615")
	private String validityAreaPrivate;

	@Nullable
	@Schema(description = "Typ des Nutzermediums", example = "chipcard")
	private Medium userMedium;


}
