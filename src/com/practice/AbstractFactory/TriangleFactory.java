package com.practice.AbstractFactory;

public class TriangleFactory  extends AbstractShapeFactory {

	@Override
	public Shape createShape() {
		return new Triangle();
	}

}
