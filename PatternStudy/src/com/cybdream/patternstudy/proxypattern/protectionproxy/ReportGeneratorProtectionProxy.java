package com.cybdream.patternstudy.proxypattern.protectionproxy;

import java.rmi.Naming;
import java.rmi.RemoteException;

import com.cybdream.patternstudy.proxypattern.remoteproxy.ReportGenerator;

public class ReportGeneratorProtectionProxy implements ReportGeneratorProxy {

	ReportGenerator reportGenerator;
	Staff staff;
	
	public ReportGeneratorProtectionProxy(Staff staff) {
		this.staff = staff;
	}
	
	@Override
	public String generateDailyReport() {
		if ( staff.isOwner()) {
			ReportGenerator reportGenerator = null;
			try {
				reportGenerator = (ReportGenerator)Naming.lookup("rmi://localhost/PizzaCoRemoteGenerator");
				return reportGenerator.generateDailyReport();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "";
		} else {
			return "Not Authorized to view report";
		}
	}

}
