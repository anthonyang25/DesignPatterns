package com.anthonyang.client;

import com.anthonyang.concreteBaseProduct.PlainYogurtIceCream;
import com.anthonyang.concreteToppings.Almond;
import com.anthonyang.concreteToppings.Cranberry;
import com.anthonyang.interfaces.YogurtIceCream;

public class App {

	public static void main(String[] args) {

		/**
		 * The PlainYogurtIceCream object is injected into Cranberry
		 * constructor, augmented by Cranberry class and re-injected to Almond
		 * class and augmented again before returning to here.
		 */
		YogurtIceCream customizedYogurtIceCream = new Almond(new Cranberry(new PlainYogurtIceCream()));
		customizedYogurtIceCream.getDescription();
		System.out.println("Total Cost: " + customizedYogurtIceCream.getPrice());
	}

}
