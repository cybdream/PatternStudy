/**
 * 
 */
package com.cybdream.patternstudy.observerpattern;

import java.util.List;

/**
 * @author user1
 *
 */
public class CommentaryObject implements Subject, Commentary {

	private final List<Observer> observers;
	private String desc;
	private final String subjectDetails;
	
	public CommentaryObject(List<Observer>observers, String subjectDetails) {
		this.observers = observers;
		this.subjectDetails = subjectDetails;
	}
	/* (non-Javadoc)
	 * @see com.cybdream.patternstudy.observerpattern.Commentary#setDesc(java.lang.String)
	 */
	@Override
	public void setDesc(String desc) {
		this.desc = desc;
		notifyObservers();
	}

	/* (non-Javadoc)
	 * @see com.cybdream.patternstudy.observerpattern.Subject#subscribeObserver(com.cybdream.patternstudy.observerpattern.Observer)
	 */
	@Override
	public void subscribeObserver(Observer observer) {
		observers.add(observer);
	}

	/* (non-Javadoc)
	 * @see com.cybdream.patternstudy.observerpattern.Subject#unSubscribeObserver(com.cybdream.patternstudy.observerpattern.Observer)
	 */
	@Override
	public void unSubscribeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);
	}

	/* (non-Javadoc)
	 * @see com.cybdream.patternstudy.observerpattern.Subject#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		System.out.println();
		for (Observer observer : observers) {
			observer.update(desc);
		}
	}

	/* (non-Javadoc)
	 * @see com.cybdream.patternstudy.observerpattern.Subject#subjectDetails()
	 */
	@Override
	public String subjectDetails() {
		return subjectDetails;
	}

}
