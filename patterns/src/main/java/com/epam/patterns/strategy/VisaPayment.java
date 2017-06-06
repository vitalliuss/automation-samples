package com.epam.patterns.strategy;

import org.openqa.selenium.By;

public class VisaPayment implements PaymentStrategy {

	public String name;
	public String cardNumber;
	public String date;
	public String code;
	
	public VisaPayment(String name, String cardNumber, String date, String code) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.date = date;
		this.code = code;
	}

	@Override
	public String toString() {
		return "VisaPayment{" +
				"name='" + name + '\'' +
				", cardNumber='" + cardNumber + '\'' +
				", date='" + date + '\'' +
				", code='" + code + '\'' +
				'}';
	}

	public void doPayment() {
		System.out.println(this.toString());
	}

}
