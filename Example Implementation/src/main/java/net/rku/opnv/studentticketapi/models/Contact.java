package net.rku.opnv.studentticketapi.models;

import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.rku.opnv.studentticketapi.models.enums.Sex;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Kontaktdaten einer Person.")
public class Contact {

	
	@Nullable
	@Schema(description = "Falls die Kontaktperson ein Schüler ist: ID des Schülers im Schulträgersystem (z.B. SchILD-NRW, winSchool, o.a.). Die ID ist dem Schüler i.A. nicht bekannt. Bei Schulwechsel oder Umzug kann sich diese ID ändern.", example = "12345A99")
	private String studentID;

	@Nonnull
	@Size(max = 120)
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Nachname", example = "Müller")
	private String lastname;

	@Nonnull
	@Size(max = 80)
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Vorname", example = "Marie")
	private String firstname;

	@Nullable
	@Size(max = 64)
	@Schema(example = "1233738B2", description = "Kundennummer des Schülers beim Verkehrsunternehmen falls bekannt (bei Folge-/Änderungsanträgen)")
	private String customerNumber;

	@Nullable
	// @Size(max = 64)
	@Schema(example = "1233738B2", description = "Vertragsnummer des Schülers beim falls bekannt (bei Folge-/Änderungsanträgen)")
	private String contractNumber;

	@Nullable
	// @Size(max = 64)
	@Schema(example = "1233738B2", description = "Abonummer des Schülers beim Verkehrsunternehmen falls bekannt (bei Folge-/Änderungsanträgen)")
	private String subscriptionNumber;



	@Nullable
	@Schema(example = "2017-07-21", description = "Geburtsdatum. Das Geburtsdatum des Schülers wird für die Fahrtberechtigung benötigt, sofern der Tarif dies vorsieht.")
	private LocalDate birthdate;

	@Nullable
	@Schema(requiredMode = RequiredMode.NOT_REQUIRED, example = "male", description = "Geschlecht. Das Geschlecht des Schülers wird für die Fahrtberechtigung benötigt, sofern der Tarif dies vorsieht")
	private Sex sex;

	@Nullable
	@Size(max = 55)
	@Schema(requiredMode = RequiredMode.NOT_REQUIRED, description = "Straße", example = "Cloudstraße")
	private String street;

	@Nullable
	@Size(max = 4 + 1 + 4)
	@PositiveOrZero
	@Schema(requiredMode = RequiredMode.NOT_REQUIRED, description = "Hausnummer", example = "22", maxLength = 9)
	private String streetnumber;

	@Nullable
	@Size(max = 10)
	@Schema(description = "Hausnummernzusatz", example = "A")
	private String streetnumberExtension;

	@Nullable
	@Size(max = 10)
	@Schema(description = "Adresszusatz. Zusatzangabe zur Hausnummer", example = "Hinterhaus")
	private String adressExtension;

	@Nullable
	@Size(max = 10)
	@Schema(description = "Postfach", example = "12 34 56")
	private String pobox;

	@Nullable
	@Size(max = 5, min = 5)
	@Schema(requiredMode = RequiredMode.NOT_REQUIRED, description = "PLZ - Postleitzahl", example = "44141")
	private String postalcode;

	@Nullable
	@Size(max = 105)
	@Schema(requiredMode = RequiredMode.NOT_REQUIRED, description = "Ort - Wohnort", example = "Dortmund")
	private String city;
	@Nullable
	@Schema(requiredMode = RequiredMode.NOT_REQUIRED, description = "Ortsteil bei ausländischem Wohnort", example = "Lütgendortmund")
	private String district;
	
	
	@Nullable
	@Schema(description = "Land bei ausländischem Wohnort", example = "Deutschland")
	private String country;

	@Nullable
	@Size(max = 20)
	@Schema(description = "Telefonnummer", example = "0123456789")
	private String phonenumber;

	@Nullable
	@Size(max = 241)
	@Email
	@Schema(maxLength = 241, description = "E-Mail-Adresse", example = "mail@example.com")
	private String eMailAddress;

}
