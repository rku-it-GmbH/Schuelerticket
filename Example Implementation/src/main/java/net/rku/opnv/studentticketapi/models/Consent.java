package net.rku.opnv.studentticketapi.models;

import org.springframework.lang.NonNull;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Zustimmungen einer Person.")
public class Consent {

	@NonNull
	private boolean privacyPolicy;

	@NonNull
	private boolean marketing;

	@NonNull
	private boolean marketResearch;
	
	@NonNull
	private boolean contactViaPhone;
	
	
	@NonNull
	private boolean contactViaMail;

}
