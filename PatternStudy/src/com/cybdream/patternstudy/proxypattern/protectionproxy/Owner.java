package com.cybdream.patternstudy.proxypattern.protectionproxy;

import com.cybdream.patternstudy.proxypattern.remoteproxy.ReportGenerator;

public class Owner implements Staff {

	private boolean isOwner = true;
	private ReportGeneratorProxy reportGenerator;
	
	@Override
	public boolean isOwner() {
		return isOwner;
	}

	@Override
	public void setReportGenerator(ReportGeneratorProxy reportGenerator) {
		this.reportGenerator = reportGenerator;
		
	}

	public String generateDailyReport() {
		try {
			return reportGenerator.generateDailyReport();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
}
