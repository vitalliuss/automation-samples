package com.epam.patterns.strategy;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class MobileMoneyPayment implements PaymentStrategy {

	public String mobileOperator;
	public String mobileNumber;
	public String code;

	public String getMobileOperator() {
		return mobileOperator;
	}

	public void setMobileOperator(String mobileOperator) {
		this.mobileOperator = mobileOperator;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public MobileMoneyPayment(String mobileOperator, String mobileNumber, String code) {
		super();
		this.mobileOperator = mobileOperator;
		this.mobileNumber = mobileNumber;
		this.code = code;
	}

	public void doPayment() {
		WebDriverInstance.getInstance().findElement(By.id("mobile-money")).click();
		WebDriverInstance.getInstance().findElement(By.id("buy")).click();

		WebDriverInstance.getInstance().findElement(By.id("continue")).click();

		new Select(WebDriverInstance.getInstance().findElement(By.id("operator"))).selectByValue(mobileOperator);
		WebDriverInstance.getInstance().findElement(By.id("continue")).click();

		WebDriverInstance.getInstance().findElement(By.id("number")).sendKeys(mobileNumber);
		WebDriverInstance.getInstance().findElement(By.id("continue")).click();

		WebDriverInstance.getInstance().findElement(By.id("code")).sendKeys(code);
		WebDriverInstance.getInstance().findElement(By.id("pay")).click();
	}
}
