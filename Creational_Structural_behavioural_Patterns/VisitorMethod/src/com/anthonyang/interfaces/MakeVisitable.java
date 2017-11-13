package com.anthonyang.interfaces;

public interface MakeVisitable {
	// a contract that standardize that all beans needs to accept purchase by
	// taking in a Visitor object, use it and return the finalized amount.
	public double acceptPurchase(Visitor visitor);
}
