/**
 *
 */
package com.practice.AbstractFactory;

/**
 * 
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Shape shape1 = ShapeFactory.getShape(new CircleFactory());
		shape1.drawShape();

		Shape shape2 = ShapeFactory.getShape(new TriangleFactory());
		shape2.drawShape();

		Shape shape3 = ShapeFactory.getShape(new RectangleFactory());
		shape3.drawShape();

	}

}
