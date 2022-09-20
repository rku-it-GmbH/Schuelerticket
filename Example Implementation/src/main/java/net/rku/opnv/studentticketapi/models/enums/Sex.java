package net.rku.opnv.studentticketapi.models.enums;

import lombok.Getter;

@Getter
public enum Sex {

	unknown(0), male(1), female(2), divers(3);

	private int value;

	private Sex(int value) {
		this.value = value;

	}

}
