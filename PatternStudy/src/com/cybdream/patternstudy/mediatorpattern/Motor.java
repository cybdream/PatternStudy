package com.cybdream.patternstudy.mediatorpattern;

public class Motor {

	public void startMotor() {
		System.out.println("Motor is started.");
	}
	
	public void rotateDrum(int drumSpeed) {
		System.out.println("rotating drum at " + drumSpeed + " rpm");
	}
}
