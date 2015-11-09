package com.epam.patterns.strategy;

import org.openqa.selenium.By;

public class VisaPayment implements PaymentStrategy {

	public String name;
	public String cardNumber;
	public String date;
	public String code;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}	
	
	public VisaPayment(String name, String cardNumber, String date, String code) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.date = date;
		this.code = code;
	}

	public void doPayment() {
		WebDriverInstance.getInstance().findElement(By.id("visa")).click();
		WebDriverInstance.getInstance().findElement(By.id("buy")).click();

		WebDriverInstance.getInstance().findElement(By.id("continue")).click();

		WebDriverInstance.getInstance().findElement(By.id("name")).sendKeys(name);
		WebDriverInstance.getInstance().findElement(By.id("card-number")).sendKeys(cardNumber);
		WebDriverInstance.getInstance().findElement(By.id("date")).sendKeys(date);
		WebDriverInstance.getInstance().findElement(By.id("code")).sendKeys(code);
		WebDriverInstance.getInstance().findElement(By.id("pay")).click();
	}

}
