package com.twilight.shape;

public class Circle implements Shape {

	private int radius = 1;
	public Circle(int radius) {
		this.radius = radius;
	
	
	}
	
	@Override
	public int getVertexCount() {
		return 0;
	}

	@Override
	public double getArea() {
		return Math.PI * (radius^2);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

}
