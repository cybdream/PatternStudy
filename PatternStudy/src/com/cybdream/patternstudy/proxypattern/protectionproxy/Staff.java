package com.cybdream.patternstudy.proxypattern.protectionproxy;

public interface Staff {
	
	public boolean isOwner();
	public void setReportGenerator(ReportGeneratorProxy reportGenerator);
}
