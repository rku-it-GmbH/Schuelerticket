package net.rku.opnv.studentticketapi.models;

import java.time.LocalDate;

import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.rku.opnv.studentticketapi.models.enums.PersonalContribution;
import net.rku.opnv.studentticketapi.models.enums.RequestType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Basisdaten zum Antrag - In diesem Element werden alle Basisdaten des Antrages übergeben, z.B. der gewünschte Gültigkeitsbeginn des Tickets.")
public class BasicData {

	@NonNull
	@PastOrPresent
	@Schema(description = "Antragsdatum", example = "2022-07-21")
	private LocalDate requestDate;



	@Nullable
	@Schema(description = "Antragsart", example = "Initial")
	private RequestType reason;

	@Nullable
	@Schema(description = "Antragsnummer", example = "123456")
	private long requestNumber;

	@Nullable
	@Size(max = 254)
	@Schema(description = "Antragsgrund Beschreibung, wenn „sonstiges“ gewählt", example = "Die Schule ist umgezogen")
	private String reasonDescription;

	@NonNull
	@Schema(description = "Zustimmung Tarifgrundlagen erteilt", example = "true")
	private boolean acceptTransportTerms;

	@NonNull
	@Schema(description = "Besteht ein Anspruch auf Ermäßigung", example = "true")
	private boolean reductionEntitled;

	@Nullable
	@Schema(description = "Eigenanteil", example = "High")
	private PersonalContribution personalContribution;
}
