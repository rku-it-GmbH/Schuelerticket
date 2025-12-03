package net.rku.opnv.studentticketapi.models;

import java.time.LocalDate;





import io.swagger.v3.oas.annotations.media.Schema;
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

	@Nonnull
	@Size(max = 120)
	@Schema(description = "Nachname", example = "Müller")
	private String lastname;
	
	@Nullable
	@Schema(description = "ID im Schulsystem", example = "12345A99")
	private String studentID;

	@Nonnull
	@Size(max = 80)
	@Schema(description = "Vorname", example = "Marie")
	private String firstname;

	@Nullable
	@Size(max = 64)
	@Schema(example = "1233738B2", description = "Kundennummer bzw. Vertragsnummer des Schülers beim Verkehrsunternehmen")
	private String customerNumber;

	@Nullable
	@Schema(example = "2017-07-21", description = "Geburtsdatum")
	private LocalDate birthday;

	@Nonnull
	@Schema(example = "male", description = "Geschlecht")
	private Sex sex;

	@Nonnull
	@NotBlank
	@Size(max = 55)
	@Schema(description = "Straße", example = "Cloudstraße")
	private String street;

	@Nonnull
	@NotBlank
	@Size(max = 4 + 1 + 4)
	@PositiveOrZero
	@Schema(description = "Hausnummer", example = "22", maxLength = 9)
	private String streetnumber;

	@Nullable
	@Size(max = 10)
	@Schema(description = "Hausnummer Zusatz", example = "A")
	private String streetnumberExtension;

	@Nullable
	@Size(max = 10)
	@Schema(description = "Adresszusatz", example = "Hinterhaus")
	private String adressExtension;

	@Nullable
	@Size(max = 10)
	@Schema(description = "Postfach", example = "12 34 56")
	private String pobox;

	@Nonnull
	@NotBlank
	@Size(max = 5, min = 5)
	@Schema(description = "PLZ - Postleitzahl", example = "44141")
	private String postalcode;

	@Nonnull
	@NotBlank
	@Size(max = 105)
	@Schema(description = "Ort - Wohnort", example = "Dortmund")
	private String city;

	@Nullable
	@Schema(description = "Ortsteil bei ausländischem Wohnort", example = "Lütgendortmund")
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
	private String eMailAdress;

}
