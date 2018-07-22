package com.twilight.demos;

public class Square {
	private int width;
	private int height;
	private char ch;
	public Square(int w) {
		width = w;
		height = w;
		ch = '*';
	}
	
	public Square(int w, int h) {
		width = w;
		height = h;
		ch = '*';
	}
	
	public Square(int w, int h, char c) {
		width = w;
		height = h;
		ch = c;
	}
	
	public void show() {
		for(int i =0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print(ch);
			}
			
			System.out.println();;
		}
	}
	
	public String getSquareString() {
		StringBuilder strRet = new StringBuilder();
		for(int i =0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				strRet.append(ch);
			}
			
			strRet.append("\n");
		}
		
		return strRet.toString();
	}

}
