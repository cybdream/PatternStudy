/**
 * 
 */
package com.cybdream.patternstudy.observerpattern;

/**
 * @author user1
 *
 */
public class SMSUsers implements Observer {

	private final Subject subject;
	private String desc;
	private String userInfo;
	
	public SMSUsers(Subject subject, String userInfo) {
		if (subject == null) {
			throw new IllegalArgumentException("No Publicsher found.");
		}
		this.subject = subject;
		this.userInfo = userInfo;
	}
	
	/* (non-Javadoc)
	 * @see com.cybdream.patternstudy.observerpattern.Observer#update(java.lang.String)
	 */
	@Override
	public void update(String desc) {
		this.desc = desc;
		display();
	}

	private void display() {
		System.out.println("["+ userInfo + "]: " + desc);
	}

	/* (non-Javadoc)
	 * @see com.cybdream.patternstudy.observerpattern.Observer#subscribe()
	 */
	@Override
	public void subscribe() {
		System.out.println("Subscribing " + userInfo 
				+ " to " + subject.subjectDetails() + " ...");
		this.subject.subscribeObserver(this);
		System.out.println("Subscribed successfully.");
	}

	/* (non-Javadoc)
	 * @see com.cybdream.patternstudy.observerpattern.Observer#unSubscribe()
	 */
	@Override
	public void unSubscribe() {
		System.out.println("Unsubscribing " + userInfo 
				+ " to " + subject.subjectDetails() + " ...");
		this.subject.unSubscribeObserver(this);
		System.out.println("Unsubscribed successfully.");
	}

}
