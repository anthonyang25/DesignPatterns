package com.anthonyang.concreteBaseProduct;

import com.anthonyang.interfaces.YogurtIceCream;

public class PlainYogurtIceCream implements YogurtIceCream {

	@Override
	public String getDescription() {
		return "Plain Yogurt Ice cream";
	}

	@Override
	public double getPrice() {
		System.out.println("The cost is Plain Yogurt Ice cream is: " + 3.0);
		return 3.0;
	}

}
