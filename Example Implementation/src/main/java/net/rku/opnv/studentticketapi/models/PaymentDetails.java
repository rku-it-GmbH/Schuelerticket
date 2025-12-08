package net.rku.opnv.studentticketapi.models;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;



import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
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
	
	
	@Size(min =15, max = 34)
	@Schema(requiredMode = RequiredMode.NOT_REQUIRED, example = "DEABCDEF123456789", description = "IBAN")
	private String iban;
	
	
	@Size(max = 20)
	@Schema(requiredMode = RequiredMode.NOT_REQUIRED, example = "WELADED2HER", description = "BIC")
	private String bic;
	
	
	@Valid
	@Nullable
	@Schema(description = "Kontoinhaber")
	private Contact payer;
	
	
	@Valid
	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Zustimmung SEPA Lastschrift", example = "true")
	private boolean directDebitConsent;
	
	@Valid
	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Zustimmung Bonitätsprüfung", example = "true")
	private boolean creditCheckConsent;
	
	
	@Valid
	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Art der Zahlung", example = "Invoice")
	private PaymentOption payment;
	

	


}
