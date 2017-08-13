package com.cybdream.patternstudy.proxypattern.remoteproxy;

import java.rmi.Naming;

public class ReportGeneratorClient {

	public static void main(String[] args) {
		new ReportGeneratorClient().generateReport();

	}
	
	public void generateReport() {
		try {
			ReportGenerator reportGenerator = (ReportGenerator)Naming.lookup("rmi://192.168.100.113/PizzaCoRemoteGenerator");
			System.out.println(reportGenerator.generateDailyReport());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
