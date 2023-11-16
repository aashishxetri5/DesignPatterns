package com.practice.AbstractFactory;

public class CircleFactory extends AbstractShapeFactory {

	@Override
	public Shape createShape() {
		return new Circle();
	}

}
