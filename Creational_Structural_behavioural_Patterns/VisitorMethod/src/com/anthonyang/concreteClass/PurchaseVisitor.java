package com.anthonyang.concreteClass;

import com.anthonyang.domain.Electronics;
import com.anthonyang.domain.Fashion;
import com.anthonyang.domain.HomeAppliances;
import com.anthonyang.interfaces.Visitor;

public class PurchaseVisitor implements Visitor {

	// concrete class that implements the calculation/business logic

	@Override
	public double visitPuchase(Electronics electronicsItem) {
		System.out.println("Electronics Item \nPrice with Delivery charges: ");
		return electronicsItem.getPrice() + 10;
	}

	@Override
	public double visitPuchase(Fashion FashionItem) {
		System.out.println("Fashion Item \nPrice with Delivery charges: ");
		return FashionItem.getPrice() + 5;
	}

	// newly added.
	@Override
	public double visitPuchase(HomeAppliances homeAppliances) {
		System.out.println("Home Appliances Item \nPrice with Delivery charges: ");
		return homeAppliances.getPrice() + 12;
	}

}
