package com.cybdream.patternstudy.facadepattern;

public class ScheduleServer {
	
	public void startBooting() {
		System.out.println("startBooing..");
	}
	
	public void readSystemConfigFile() {
		System.out.println("startBooing..");
	}
	
	public void init() {
		System.out.println("startBooing..");
	}
	
	public void initializeContext() {
		System.out.println("initializeContext..");
	}
	
	public void  initializeListeners() {
		System.out.println("initializeListeners..");
	}
	
	public void createSystemObjects() {
		System.out.println("createSystemObjects..");
	}
	
	public void releaseProcesses() {
		System.out.println("releaseProcesses..");
	}
	
	public void destroy() {
		System.out.println("destroy..");
	}
	
	public void destroySystemObjects() {
		System.out.println("destroySystemObjects..");
	}
	
	public void destroyListeners() {
		System.out.println("destroyListeners..");
	}
	
	public void destroyContext() {
		System.out.println("destroyContext..");
	}
	
	public void shutdown() {
		System.out.println("shutdown..");
	}
	
}
