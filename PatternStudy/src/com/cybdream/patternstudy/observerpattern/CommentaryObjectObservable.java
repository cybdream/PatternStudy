/**
 * 
 */
package com.cybdream.patternstudy.observerpattern;

import java.util.Observable;

/**
 * @author user1
 *
 */
public class CommentaryObjectObservable extends Observable implements Commentary {

	private String desc;
	private final String subjectDetails;
	
	public CommentaryObjectObservable(String subjectDetails) {
		this.subjectDetails = subjectDetails;
	}
	
	/* (non-Javadoc)
	 * @see com.cybdream.patternstudy.observerpattern.Commentary#setDesc(java.lang.String)
	 */
	@Override
	public void setDesc(String desc) {
		this.desc = desc;
		setChanged();
		notifyObservers(desc);
	}

	public String subjectDetails() {
		return subjectDetails;
	}
}
