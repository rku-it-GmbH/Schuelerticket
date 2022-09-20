package net.rku.opnv.studentticketapi.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

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
	
	@NonNull
	@NotBlank
	@Size(max=250)
	@Schema(description = "Name der Schule", example = "ABC Grundschule")
	private String name;
	
	@Nullable
	@Schema(description = "Schultyp", example = "Grundschule")
	private SchoolType schoolType;
}
