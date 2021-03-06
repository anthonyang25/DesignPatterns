package com.anthonyang.subjects;

import com.anthonyang.observers.IObserver;

/*Any system that wants to implement a notifcation service,
 * or need such methods can implement this interface.
 */
interface ISubject {

	void registerObserver(IObserver o);
	void removeObserver(IObserver o);
	void notifyObservers();

}
