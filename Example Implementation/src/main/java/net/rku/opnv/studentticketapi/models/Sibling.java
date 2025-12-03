package net.rku.opnv.studentticketapi.models;

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
	private Contact customer;
	
	@Valid
	@Nonnull
	private School school;

}
