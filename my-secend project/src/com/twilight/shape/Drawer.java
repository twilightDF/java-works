package com.twilight.shape;

import java.util.ArrayList;
import java.util.List;

public class Drawer {
	
	private List<Shape> shapeList = new ArrayList<Shape>();
	public void addShape(Shape shape) {
		shapeList.add(shape);
	}
	
	public int getShapeCount() {
		return shapeList.size();
	}
	
	public double getTotalArea() {
		double totalArea = 0.0;
		for(int i = 0; i < shapeList.size(); i++) {
			totalArea += shapeList.get(i).getArea();
		}
		
		return totalArea;
	}
	
	public double getTotalPerimeter() {
		double totalPerimeter = 0.0;
		for(int i = 0; i < shapeList.size(); i++) {
			totalPerimeter += shapeList.get(i).getPerimeter();
		}
		
		return totalPerimeter;
	}
	
	public static void main(String[] args) {
		Drawer drawer = new Drawer();
		
		drawer.addShape(new Circle(10));
		drawer.addShape(new Square(10));
		drawer.addShape(new Triangle(10, 3, 2.1));
		drawer.addShape(new Triangle(5, 3, 2.5));
		drawer.addShape(new Circle(4));
		
		System.out.println(drawer.getShapeCount() + " " + drawer.getTotalPerimeter() + " " + 
				drawer.getTotalArea());
		
		
	}
	
}









