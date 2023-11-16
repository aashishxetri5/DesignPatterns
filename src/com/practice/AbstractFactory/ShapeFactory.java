package com.practice.AbstractFactory;

public class ShapeFactory {
	
	public static Shape getShape(AbstractShapeFactory factory) {
		
		return factory.createShape();
		
	}

}
