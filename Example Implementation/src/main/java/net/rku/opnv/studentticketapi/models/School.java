package net.rku.opnv.studentticketapi.models;


import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.rku.opnv.studentticketapi.models.enums.SchoolType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {

	@Nonnull
	@PositiveOrZero
	@Max(value = 999999999l)
	@Schema(requiredMode = RequiredMode.REQUIRED, description = "Soweit bekannt, eindeutige ID der Schule", maxLength = 10, example = "61854")
	private long schoolId;
	
	@Nullable
	@Size(max=250)
	@Schema(description = "Name der Schule", example = "ABC Grundschule")
	private String schoolName;
	
	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED,description = "Schultyp", example = "Grundschule")
	private SchoolType schoolType;
}
