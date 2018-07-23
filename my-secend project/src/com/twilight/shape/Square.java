package com.twilight.shape;

public class Square implements Shape {
	
	private int borderLength = 1;
	
	public  Square (int borderLength) {
		this.borderLength = borderLength;
		
	}
	@Override
	public int getVertexCount() {
		return 4;
	}

	@Override
	public double getArea() {
		return (borderLength^2);
	}

	@Override
	public double getPerimeter() {
		return 4*borderLength;
	}
}
