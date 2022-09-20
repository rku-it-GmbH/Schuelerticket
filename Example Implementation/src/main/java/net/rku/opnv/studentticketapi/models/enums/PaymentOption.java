package net.rku.opnv.studentticketapi.models.enums;

import lombok.Getter;

@Getter
public enum PaymentOption {

	Invoice(1), DirectDebit(2);

	private int value;

	private PaymentOption(int value) {
		this.value = value;

	}

}
