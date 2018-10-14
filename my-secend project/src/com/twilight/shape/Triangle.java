package com.twilight.shape;

public class Triangle implements Shape {

	private double borderA = 1;
	private double borderB = 1;
	private double angle = 0;

	//构造器，用于传进参数！
	public Triangle(double borderA, double borderB, double angle) {

		this.borderA = borderA;
		this.borderB = borderB;
		this.angle = angle;

	}

	@Override
	public int getVertexCount() {
		return 3;
	}

	@Override
	public double getArea() {
		return (1 / 2) * borderA * borderB * Math.sin(angle);
	}

	@Override
	public double getPerimeter() {
		double borderC = Math.sqrt(borderA * borderA  + borderB * borderB - 2 * borderA * borderB * Math.cos(angle)) ;
		return borderA + borderB + borderC;
	}

}
