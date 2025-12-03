package net.rku.opnv.studentticketapi.models;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;



import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.rku.opnv.studentticketapi.models.enums.PaymentOption;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDetails {
	
	@Nullable
	@Size(max = 64)
	@Schema(description = "Name der Bank, nur optionale Angabe zur Kontrolle", maxLength = 64, example = "Sparkasse Herne")
	private String bankName;
	
	@Nonnull
	@NotBlank
	@Size(min =15, max = 34)
	@Schema(example = "DEABCDEF123456789", description = "IBAN")
	private String iban;
	
	@Nonnull
	@NotBlank
	@Size(max = 20)
	@Schema(example = "WELADED2HER", description = "BIC")
	private String bic;
	
	
	@Valid
	@Nonnull
	@Schema(description = "Kontoinhaber")
	private Contact payer;
	
	
	@Valid
	@Nonnull
	@Schema(description = "Zustimmung SEPA Lastschrift", example = "true")
	private boolean directDebitConsent;
	
	@Valid
	@Nonnull
	@Schema(description = "Zustimmung Bonitätsprüfung", example = "true")
	private boolean creditCheckConsent;
	
	
	@Valid
	@Nonnull
	@Schema(description = "Art der Zahlung", example = "Invoice")
	private PaymentOption payment;
	

	


}
