package com.twilight.demos;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class StringDemoTest {

	@Test
	public void testCharacter() throws IOException {
	
		char ch = ' ';
		while(ch != 'x') {
			ch = (char) System.in.read();
			
			System.out.println(Character.toUpperCase(ch));
		}
	}
	
	@Test
	public void testSquare() {
		Square square = new Square(20, 8, 'c');
		System.out.println(square.getSquareString());
	}
	@Test
	public void testTriangle() {
		Triangle triangle = new Triangle(6,'*');
		triangle.show();
	}
	
}

	

	
