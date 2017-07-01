package com.cybdream.patternstudy.adapterpattern.test;

import com.cybdream.patternstudy.adapterpattern.payd.PayD;
import com.cybdream.patternstudy.adapterpattern.site.XpayImpl;
import com.cybdream.patternstudy.adapterpattern.site.XpayToPayDAdapter;
import com.cybdream.patternstudy.adapterpattern.xpay.Xpay;

public class RunAdapterExample {
	public static void main(String[] args){
		Xpay xpay = new XpayImpl();
		xpay.setCreditCardNo("4789565874102365");
		xpay.setCustomerName("Max Warner");
		xpay.setCardExpireMonth("09");
		xpay.setCardExpireYear("25");
		xpay.setCardCVVNo((short)235);
		xpay.setAmount(2565.23);
		
		PayD payD = new XpayToPayDAdapter(xpay);
		testPayD(payD);
	}

	private static void testPayD(PayD payD) {
		System.out.println(payD.getCardOwnerName());
		System.out.println(payD.getCustCardNo());
		System.out.println(payD.getCardExpMonthDate());
		System.out.println(payD.getCVVNo());
		System.out.println(payD.getTotalAmount());
		
		
	}
}
