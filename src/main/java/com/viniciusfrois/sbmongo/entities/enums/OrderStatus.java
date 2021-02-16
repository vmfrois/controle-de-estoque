package com.viniciusfrois.sbmongo.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(0);
	
	private Integer code;
	
	private OrderStatus(Integer code) {
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}
	
}
