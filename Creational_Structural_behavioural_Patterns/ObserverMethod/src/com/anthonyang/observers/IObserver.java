package com.anthonyang.observers;

import com.anthonyang.domain.Employee;

/**
 * This interface defines the method that the subject will call when it wants to
 * notify its list of observers. This is actually the callback method from what
 * I understand.
 * 
 * @author Screencasts
 *
 */

/*
 * Another system that implements ISubject can create such an IObserver
 * interface to define similar method to the method below to call respective
 * classes/departments
 */
public interface IObserver {
	public void callMe(Employee emp, String msg); // When something changes in the
											// subject it should call this
											// method..
}
