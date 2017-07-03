package com.cybdream.patternstudy.singletonpattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4253773405176463402L;
	private static Singleton sc = new Singleton();
	private Singleton() {
		if (sc != null) {
			throw new IllegalStateException("Already created.");
		}
	}
	
	public static Singleton getInstance() {
		return sc;
	}
	
	private Object readResolve() throws ObjectStreamException {
		return sc;
	}

	private Object writeReplace() throws ObjectStreamException {
		return sc;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Singleton, cannot be clonned");
	}
	
	@SuppressWarnings("unused")
	private static Class getClass(String classname) throws ClassNotFoundException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		if ( classLoader == null ) {
			classLoader = Singleton.class.getClassLoader();
		}
		return (classLoader.loadClass(classname));
	}
}
