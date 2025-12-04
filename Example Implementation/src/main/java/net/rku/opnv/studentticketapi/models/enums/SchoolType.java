package net.rku.opnv.studentticketapi.models.enums;

import lombok.Getter;

/**
 * Quelle für Schulformen:
 * https://www.schulministerium.nrw/schule-bildung/schulorganisation/schulformen
 * 
 * @author rzsauerb
 *
 */

@Getter
public enum SchoolType {

	Grundschule(1), Gymnasium(2), Realschule(3), Gesamtschule(4), Hauptschule(5), Berufsschule(6), Mittelschule(7),
	Sekundarschule(8), Foerderschule(9), Wirtschaftsschule(10), Berufsfachschule(11), Berufsoberschule(12),
	Fachoberschule(13), Fachschule(14), Gemeinschaftsschule(15), Berufliches_Gymnasium(16), Berufskolleg(17),
	Oberstufenkolleg(18), Weiterbildungskolleg(19), Ersatzschule(20), Unknown(999);

	private int value;

	private SchoolType(int value) {
		this.value = value;

	}

}
