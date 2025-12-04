package net.rku.opnv.studentticketapi.models;

import java.time.LocalDate;
import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.rku.opnv.studentticketapi.models.enums.PersonalContribution;
import net.rku.opnv.studentticketapi.models.enums.RequestType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Basisdaten zum Antrag - In diesem Element werden alle Basisdaten des Antrages übergeben, z.B. der gewünschte Gültigkeitsbeginn des Tickets")
public class BasicData {

	@Nonnull
	@PastOrPresent
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Datum an dem der Antrag durch den Antragsteller gestellt wurde", example = "2022-07-21")
	private Date requestDate;

	@Nullable
	@Schema(description = "Datum, an dem der Antrag durch den Schulträger bearbeitet bzw. entschieden wurde", example = "2022-07-21")
	private Date processingDate;

	@Nullable
	@Schema(description = "Sender des Antrags. Das ist in der Regel der Schulträger. Empfohlen wird die Nutzung der Schulträgerdaten, die das Schulministerium NRW als Open-Date bereitstellt", example = "Schulamt Gelsenkirchen")
	private String sender;

	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Antragsnummer aus dem Schulträgersystem", example = "123456A9")
	private String requestID;

	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Besteht ein Anspruch auf Ermäßigung", example = "true")
	private boolean reductionEntitled;

	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Eigenanteil", example = "High")
	private PersonalContribution personalContribution;

	@Nullable
	// @Size(max = 500)
	@Schema(description = "Notiz des Schulträgers an das Verkehrsunter-nehmen. Nur mit Merkmalen, die das Vertrags-verhältnis betreffen auszufüllen. \r\n Anmerkungen zum Antrag können hier als Frei-text festgehalten werden", example = "Bitte erneut prüfen")
	private String note;

	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Antragsart", example = "Initial")
	private RequestType requestType;







}
