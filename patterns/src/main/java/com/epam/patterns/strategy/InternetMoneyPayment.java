package com.epam.patterns.strategy;

public class InternetMoneyPayment implements PaymentStrategy {

	private String id;
	private String password;

	public InternetMoneyPayment(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	@Override
	public String toString() {
		return "InternetMoneyPayment{" +
				"id='" + id + '\'' +
				", password='" + password + '\'' +
				'}';
	}

	public void doPayment() {
		System.out.println(this.toString());
	}
}
