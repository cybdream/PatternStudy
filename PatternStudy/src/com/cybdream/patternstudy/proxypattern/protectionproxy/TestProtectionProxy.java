package com.cybdream.patternstudy.proxypattern.protectionproxy;

public class TestProtectionProxy {
	
	public static void main(String[] args) {
		Owner owner = new Owner();
		ReportGeneratorProxy reportGenerator = new ReportGeneratorProtectionProxy(owner);
		owner.setReportGenerator(reportGenerator);
		
		Employee employee = new Employee();
		reportGenerator = new ReportGeneratorProtectionProxy(employee);
		employee.setReportGenerator(reportGenerator);
		
		System.out.println("For owner : ");
		System.out.println(owner.generateDailyReport());
		System.out.println("For Employee: ");
		System.out.println(employee.generateDailyReport());
	}
}
