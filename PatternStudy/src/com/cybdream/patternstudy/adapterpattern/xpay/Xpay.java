package com.cybdream.patternstudy.adapterpattern.xpay;

public interface Xpay {
	public String getCreditCardNo();
	public String getCustomerName();
	public String getCardExpireMonth();
	public String getCardExpireYear();
	public Short getCardCVVNo();
	public Double getAmount();
	
	public void setCreditCardNo(String creditCardNo);
	public void setCustomerName(String customerName);
	public void setCardExpireMonth(String cardExpireMonth);
	public void setCardExpireYear(String cardExpireYear);
	public void setCardCVVNo(Short cardCVVNo);
	public void setAmount(Double amount);
}
