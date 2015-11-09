package com.epam.patterns.strategy;

public class PaymentContext {

	private PaymentStrategy paymentStrategy;

	public PaymentStrategy getPaymentStrategy() {
		return paymentStrategy;
	}

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public PaymentContext() {
	}

	public PaymentContext(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void pay() {
		this.paymentStrategy.doPayment();
	}
}
