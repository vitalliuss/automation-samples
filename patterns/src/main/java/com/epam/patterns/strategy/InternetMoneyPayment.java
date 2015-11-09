package com.epam.patterns.strategy;

import org.openqa.selenium.By;

public class InternetMoneyPayment implements PaymentStrategy {

	private String id;
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public InternetMoneyPayment(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public void doPayment() {
		WebDriverInstance.getInstance().findElement(By.id("internet-money")).click();
		WebDriverInstance.getInstance().findElement(By.id("buy")).click();

		WebDriverInstance.getInstance().findElement(By.id("continue")).click();

		WebDriverInstance.getInstance().findElement(By.id("id")).sendKeys(id);
		WebDriverInstance.getInstance().findElement(By.id("pass")).sendKeys(password);
		WebDriverInstance.getInstance().findElement(By.id("login")).click();

		WebDriverInstance.getInstance().findElement(By.id("pay")).click();
	}
}
