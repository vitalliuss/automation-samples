package com.epam.patterns.strategy;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPaymentMethod {

	private PaymentContext paymentContext = new PaymentContext();

	@Test
	public void testPayWithVisa() {
		assertPay(new VisaPayment("Vitali Shulha", "4589-5432-4567-6545", "10/12/2015", "345"));
	}

	@Test
	public void testPayWithInternetMoney() {
		assertPay(new InternetMoneyPayment("98309680938", "Fghfk45HTfe"));
	}

	@Test
	public void testPayWithMobileMoney() {
		assertPay(new MobileMoneyPayment("mts", "+375-29-2129936", "FT45"));
	}

	private void assertPay(PaymentStrategy paymentStrategy) {
		paymentContext.setPaymentStrategy(paymentStrategy);
		paymentContext.pay();
	}
}