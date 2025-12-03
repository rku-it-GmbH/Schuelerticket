package net.rku.opnv.studentticketapi.models;


import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.rku.opnv.studentticketapi.models.enums.SchoolType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {

	@Nullable
	@PositiveOrZero
	@Max(value = 999999999l)
	@Schema(description = "Soweit bekannt, eindeutige ID der Schule", maxLength = 10, example = "61854")
	private long id;
	
	@Nonnull
	@NotBlank
	@Size(max=250)
	@Schema(description = "Name der Schule", example = "ABC Grundschule")
	private String name;
	
	@Nullable
	@Schema(description = "Schultyp", example = "Grundschule")
	private SchoolType schoolType;
}
