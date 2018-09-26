package com.game.demos;

import java.awt.Color;
import java.awt.Graphics;

public class Shell extends GameObject{

	
	double degree;
	Plane live  = new Plane();
	
	public  /*构造函数没有返回值！*/ Shell(){
		x = 200;
		y = 200;
		height = 10;
		width = 10;
		speed = 3;
		
		degree = Math.random() * (Math.PI  * 2);
	}
	
	public void drawSelf(Graphics g) {
		
		Color c = g.getColor();
		g.setColor(Color.yellow);
	
		g.fillOval((int)x,(int) y, width, height);
			y += speed * Math.sin(degree);
			x += speed * Math.cos(degree);
		
		if(x < 0|| x >500 - width) {
			degree = Math.PI - degree;
		}
		if(y < 0 + 30 || y >500 - height - 20 /*边界误差*/) {
			degree = -degree;
		}
			
			
		g.setColor(c);
	}
}


