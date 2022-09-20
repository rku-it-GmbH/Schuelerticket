package net.rku.opnv.studentticketapi.models;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

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
	
	@NonNull
	@NotBlank
	@Size(min =15, max = 34)
	@Schema(example = "DEABCDEF123456789", description = "IBAN")
	private String iban;
	
	@NonNull
	@NotBlank
	@Size(max = 20)
	@Schema(example = "WELADED2HER", description = "BIC")
	private String bic;
	
	
	@Valid
	@NonNull
	@Schema(description = "Kontoinhaber")
	private Contact payer;
	
	
	@Valid
	@NonNull
	@Schema(description = "Zustimmung SEPA Lastschrift", example = "true")
	private boolean directDebitConsent;
	
	@Valid
	@NonNull
	@Schema(description = "Zustimmung Bonitätsprüfung", example = "true")
	private boolean creditCheckConsent;
	
	
	@Valid
	@NonNull
	@Schema(description = "Art der Zahlung", example = "Invoice")
	private PaymentOption payment;
	

	


}
