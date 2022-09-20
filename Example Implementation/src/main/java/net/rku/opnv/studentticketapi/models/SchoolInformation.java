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
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class SchoolInformation {
	
	@Valid
	@Nullable
	@Schema(description = "Alte/ehemalige Schule")
	private School oldSchool;
	
	@Valid
	@NonNull
	@Schema(description = "Aktuelle/aufnehmende Schule")
	private School school;
	
	@NonNull
	@NotBlank
	@Size(max=6)
	@Schema(description = "Klasse/Jahrgangsstufe", example = "6A")
	private String classNumber;
	
	@Nullable
	@Size(max=250)
	@Schema(description = "Bildungsgang", example = "Ausbildungsklasse Elektrotechnik")
	private String courseOfEducation;
	
	@Nullable
	@Schema(description = "Schulbescheinigung", example = "true")
	private boolean schoolCertificateChecked;
	
	

}
