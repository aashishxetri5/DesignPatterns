package com.practice.AbstractFactory;

public class RectangleFactory extends AbstractShapeFactory {

	@Override
	public Shape createShape() {
		return new Rectangle();
	}

}
