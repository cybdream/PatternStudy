/**
 * 
 */
package com.cybdream.patternstudy.observerpattern;

/**
 * @author cybdream
 *
 */
public interface Observer {
	
	public void update(String desc);
	public void subscribe();
	public void unSubscribe();
	
}
