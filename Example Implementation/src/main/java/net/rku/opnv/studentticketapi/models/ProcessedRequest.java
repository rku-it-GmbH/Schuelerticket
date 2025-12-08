package net.rku.opnv.studentticketapi.models;

import java.util.Map;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.rku.opnv.studentticketapi.models.enums.RequestStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcessedRequest {

	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Antragsnummer aus dem Schulträgersystem. Im ProcessedRequest ist die gleiche Nummer, wie in BasicData im Request zu nutzen.", example = "123456A9")
	private String requestID;

	@Nullable
	@Schema(description = "Ermitteltes Produkt", example = "Schokoticket")
	private String product;

	@Nullable
	@Schema(description = "Ermittelte Produktnummer", example = "619A1")
	private String productNumber;

	
	@Schema(description = "Ermittelter Preis", example = "15.90")
	private float price;
	
	@Nullable
	// @Size(max = 64)
	@Schema(example = "1233738B2", description = "Kundennummer der Person beim Verkehrsun-ternehmen (bei Folge-/Änderungsanträgen)")
	private String customerNumber;

	@Nullable
	// @Size(max = 64)
	@Schema(example = "1233738B2", description = "Vertragsnummer der Person beim Verkehrsun-ternehmen (bei Folge-/Änderungsanträgen)")
	private String contractNumber;

	@Nullable
	// @Size(max = 64)
	@Schema(example = "1233738B2", description = "Abonummer der Person beim Verkehrsunter-nehmen (bei Folge-/Änderungsanträgen)")
	private String subscriptionNumber;

	@Nullable
    @Schema(enumAsRef = true, example = "approved", description = "Status des Antrags: \n" +
        "* `UNPROCESSED` - Unprocessed (noch nicht verarbeitet)\n" +
        "* `ERROR` - error (Fehler bei der Verarbeitung)\n" +
        "* `APPROVED` - approved (Antrag angenommen)\n" +
        "* `DENIED` - denied (Antrag abgelehnt)\n" +
        "* `NEEDS_REVISION` - needs_revision (muss überarbeitet wer-den)\n" +
        "* `OTHER` - other (anderes)")
	private RequestStatus status;

	@Nullable
	// @Size(max = 500)
	@Schema(example = "Adresse des Kindes ist nicht bekannt", description = "Notiz des Bearbeiters. Beispielsweise Begründung zum Status")
	private String note;

	@Nullable
	@Schema(description = "Fehler bei der Verarbeitung. Fehlercode und Text sind zwischen den beiden Schnittstellennutzern zu vereinbaren")
	private Map<String, String> errors;

}
