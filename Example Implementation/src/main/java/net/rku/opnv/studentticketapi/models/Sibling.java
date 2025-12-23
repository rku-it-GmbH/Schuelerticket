package net.rku.opnv.studentticketapi.models;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sibling {
	
	@Valid
	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED)
	private Contact customer;
	
	@Valid
	@Nonnull
	@Schema(requiredMode = RequiredMode.REQUIRED)
	private School school;

}
