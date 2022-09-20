package net.rku.opnv.studentticketapi.models.enums;

import lombok.Getter;

/**
 * Antragsart</br>
 * 
 * Auswahl: </br>
 * 001 Erstantrag </br>
 * 002 Folgeantrag </br>
 * 003 Änderungsantrag (Adresse, Wohnort, Bankdaten) </br>
 * 004 Kündigung
 */
@Getter
public enum RequestType {

	Initial("001"), Followup("002"), Change("003"), Cancel("004"), Other("999");

	private String value;

	private RequestType(String value) {
		this.value = value;

	}

}
