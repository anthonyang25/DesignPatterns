package com.anthonyang.interfaces;

import com.anthonyang.domain.Electronics;
import com.anthonyang.domain.Fashion;

public interface Visitor {
	public double visitPuchase(Electronics electronicsItem);

	public double visitPuchase(Fashion FashionItem);

}
