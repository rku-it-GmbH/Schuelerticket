package net.rku.opnv.studentticketapi.models;



import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.annotation.Nonnull;
import lombok.Data;

@Data
public class Stop {
	
	@Schema(requiredMode = RequiredMode.REQUIRED, example = "DE:45138:85613", description = "Eindeutige ID der Haltestelle")
	@Nonnull
	private String id;
	
	@Schema(requiredMode = RequiredMode.REQUIRED, example = "Herne, Sparkasse", description = "Name der Haltestelle")
	@Nonnull
	private String name;
}