package com.cybdream.patternstudy.adapterpattern.site;

import com.cybdream.patternstudy.adapterpattern.payd.PayD;
import com.cybdream.patternstudy.adapterpattern.xpay.Xpay;

public class XpayToPayDAdapter implements PayD {

	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonthDate; 
	private Integer cVVNo;
	private Double totalAmount;
	
	private final Xpay xpay;
	
	public XpayToPayDAdapter(Xpay xpay){
		this.xpay = xpay;
		setProp();
	}
	
	@Override
	public String getCustCardNo() {
		return custCardNo;
	}

	@Override
	public String getCardOwnerName() {
		return cardOwnerName;
	}

	@Override
	public String getCardExpMonthDate() {
		return cardExpMonthDate;
	}

	@Override
	public Integer getCVVNo() {
		return cVVNo;
	}

	@Override
	public Double getTotalAmount() {
		return totalAmount;
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.cardExpMonthDate = cardExpMonthDate;
	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		this.cVVNo = cVVNo;
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	/**
	 * Xpay 클래스에서 PayD 클래스로 변환하기 위하여 
	 * 프로퍼티값을 설정하는 메서드가 필요하다.
	 */
	private void setProp(){
		setCardOwnerName(this.xpay.getCustomerName());
		setCustCardNo(this.xpay.getCreditCardNo());
		setCardExpMonthDate(this.xpay.getCardExpireMonth() + "/" 
				+ this.xpay.getCardExpireYear());
		setCVVNo(this.xpay.getCardCVVNo().intValue());
		setTotalAmount(this.xpay.getAmount());
		
	}
}
