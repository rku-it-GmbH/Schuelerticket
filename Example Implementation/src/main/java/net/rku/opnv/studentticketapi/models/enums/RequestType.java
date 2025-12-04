package net.rku.opnv.studentticketapi.models.enums;

import lombok.Getter;


@Getter
public enum RequestType {

	Initial("101"), Followup("102"), Change_Payment("301"), Change_Address("302"), Change_School("302"), Cancel("400"),
	Other("999");


	private String value;

	private RequestType(String value) {
		this.value = value;

	}

}
