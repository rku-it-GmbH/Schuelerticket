package net.rku.opnv.studentticketapi.models;

import java.util.List;

import javax.validation.Valid;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {

	@Valid
	@NonNull
	@Schema(description = "Basisdaten des Antrags")
	private BasicData basisdaten;
	
	@Valid
	@NonNull
	@Schema(description = "Informationen zum Ticket")
	private TicketInformation ticketInformation;


	@Valid
	@NonNull
	@Schema(description = "Dieses Element enthält die Daten zum Kunden (Schüler/Abonnent)")
	private Contact student;

	@Valid
	@Nullable
	@Schema(description = "Angaben zum gesetzlichen Vertreter - Das Element muss dann verpflichtend übergeben werden, wenn der Kunde minderjährig ist.")
	private Contact representative;
	
	@Valid
	@Nullable
	@Schema(description = "Dieser Datensatz ist optional, da der Antragsteller nicht zur Angabe ggü. der Stadt Dortmund verpflichtet werden kann. Wird der Datensatz jedoch geliefert (freiwillige Angabe des Antrag-stellers), sind bestimmte Elemente verpflichtend")
	private PaymentDetails paymentDetails;
	
	
	@Valid
	@NonNull
	@Schema(description = "Verschiedene Einwilligungen")
	private Consent consent;

	@Valid
	@NonNull
	@Schema(description = "In diesem Element werden die Daten zur aufnehmenden und ggf. zur alten Schule überge-ben")
	private SchoolInformation schoolInformation;



	@Valid
	@NonNull
	@Schema(description = "Angaben von Geschwisterkindern zur Festlegung des Eigenanteils."
			+ " Dieser Datensatz entfällt, wenn keine Geschwisterbeziehungen angegeben wurden. Dann wird ein leeres Array erwartet.")
	private List<Sibling> siblings;

}
