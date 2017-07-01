package com.cybdream.patternstudy.adapterpattern.site;

import com.cybdream.patternstudy.adapterpattern.xpay.Xpay;

public class XpayImpl implements Xpay {
	
	private String creditCardNo;
	private String customerName;
	private String cardExpireMonth;
	private String cardExpireYear;
	private Short cardCVVNo;
	private Double amount;

	@Override
	public String getCreditCardNo() {
		return creditCardNo;
	}

	@Override
	public String getCustomerName() {
		return customerName;
	}

	@Override
	public String getCardExpireMonth() {
		return cardExpireMonth;
	}

	@Override
	public String getCardExpireYear() {
		return cardExpireYear;
	}

	@Override
	public Short getCardCVVNo() {
		return cardCVVNo;
	}

	@Override
	public Double getAmount() {
		return amount;
	}

	@Override
	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	@Override
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public void setCardExpireMonth(String cardExpireMonth) {
		this.cardExpireMonth = cardExpireMonth;
	}

	@Override
	public void setCardExpireYear(String cardExpireYear) {
		this.cardExpireYear = cardExpireYear;
	}

	@Override
	public void setCardCVVNo(Short cardCVVNo) {
		this.cardCVVNo = cardCVVNo;
	}

	@Override
	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
