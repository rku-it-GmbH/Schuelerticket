package net.rku.opnv.studentticketapi.models.enums;

import lombok.Getter;

@Getter
public enum Medium {

	chipcard(1), app(2), paper(3);

	private int value;

	private Medium(int value) {
		this.value = value;

	}

}
