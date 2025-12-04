package net.rku.opnv.studentticketapi.models.enums;

import lombok.Getter;

@Getter
public enum RequestStatus {

	unprocessed(0), error(999), approved(1), denied(2), needs_revision(3), other(1000);

	private int value;

	private RequestStatus(int value) {
		this.value = value;

	}

}

