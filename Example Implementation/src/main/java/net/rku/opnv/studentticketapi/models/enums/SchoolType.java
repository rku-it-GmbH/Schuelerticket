package net.rku.opnv.studentticketapi.models.enums;

import lombok.Getter;

@Getter
public enum SchoolType {

	Grundschule(1), Gymnasium(2), Realschule(3), Gesamtschule(4), Hauptschule(5), Berufsschule(6), Mittelschuke(7);

	private int value;

	private SchoolType(int value) {
		this.value = value;

	}

}
