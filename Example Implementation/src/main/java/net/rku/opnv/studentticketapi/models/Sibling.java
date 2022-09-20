package net.rku.opnv.studentticketapi.models;

import javax.validation.Valid;

import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sibling {
	
	@Valid
	@NonNull
	private Contact customer;
	
	@Valid
	@NonNull
	private School school;

}
