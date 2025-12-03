package net.rku.opnv.studentticketapi.models;

import java.time.LocalDate;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Future;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketInformation {
	
	 
	@Nonnull
	@Future
	@Schema(description = "Abo-Beginn", example = "2023-05-21")
	private LocalDate subscribtionStart;

	@Nullable
	@Future
	@Schema(description = "Abo-Ende", example = "2022-08-01")
	private LocalDate subscribtionEnd;
	
	
	@Nonnull
	@Schema(description = "Verkehrsverbund", example = "AVV")
	private String trafficAssociation;
	
	
	@Nullable
	@Schema(description = "Verkehrsunternehmen", example = "BOGESTRA")
	private String trafficCompany;
	
	@Nonnull
	@Schema(description = "Produkt", example = "Schokoticket")
	private String product;
	
	@Nonnull
	@Schema(description = "Produktnummer", example = "691581")
	private long productNumber;
	
	
	@Nullable
	@Schema(description = "Zielhaltestelle", example = "Herne, Berliner Platz")
	private String destinationStop;
	
	@Nullable
	@Schema(description = "Starthaltestelle", example = "Bochum, Jahrhunderthalle")
	private String startingStop;
	
	@Nullable
	@Schema(description = "Geltungsbereich", example = "Wabe 615")
	private String validityAreaSchool;
	
	
	@Nullable
	@Schema(description = "Geltungsbereich beim Zukauf von Freizeitnutzung", example = "Wabe 615")
	private String validityAreaPrivate;
	

}
