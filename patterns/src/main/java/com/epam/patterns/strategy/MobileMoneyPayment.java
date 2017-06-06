package com.epam.patterns.strategy;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class MobileMoneyPayment implements PaymentStrategy {

	public String mobileOperator;
	public String mobileNumber;
	public String code;


	public MobileMoneyPayment(String mobileOperator, String mobileNumber, String code) {
		super();
		this.mobileOperator = mobileOperator;
		this.mobileNumber = mobileNumber;
		this.code = code;
	}

	@Override
	public String toString() {
		return "MobileMoneyPayment{" +
				"mobileOperator='" + mobileOperator + '\'' +
				", mobileNumber='" + mobileNumber + '\'' +
				", code='" + code + '\'' +
				'}';
	}

	public void doPayment() {
		System.out.println(this.toString());
	}
}
