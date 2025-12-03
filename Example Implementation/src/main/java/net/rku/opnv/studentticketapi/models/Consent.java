package net.rku.opnv.studentticketapi.models;



import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Zustimmungen einer Person.")
public class Consent {

	@Nonnull
	private boolean privacyPolicy;

	@Nonnull
	private boolean marketing;

	@Nonnull
	private boolean marketResearch;
	
	@Nonnull
	private boolean contactViaPhone;
	
	
	@Nonnull
	private boolean contactViaMail;

}
