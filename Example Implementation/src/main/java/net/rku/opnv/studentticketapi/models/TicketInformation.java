package net.rku.opnv.studentticketapi.models;

import java.time.LocalDate;

import javax.validation.constraints.Future;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketInformation {
	
	 
	@NonNull
	@Future
	@Schema(description = "Abo-Beginn", example = "2023-05-21")
	private LocalDate subscribtionStart;

	@Nullable
	@Future
	@Schema(description = "Abo-Ende", example = "2022-08-01")
	private LocalDate subscribtionEnd;
	
	
	@NonNull
	@Schema(description = "Verkehrsverbund", example = "AVV")
	private String trafficAssociation;
	
	
	@Nullable
	@Schema(description = "Verkehrsunternehmen", example = "BOGESTRA")
	private String trafficCompany;
	
	@NonNull
	@Schema(description = "Produkt", example = "Schokoticket")
	private String product;
	
	@NonNull
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
