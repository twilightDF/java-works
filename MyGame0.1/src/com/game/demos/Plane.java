package com.game.demos;

import java.awt.Graphics;
import java.awt.Image;

public class Plane extends GameObject {

	//重写父类里面的drawSelf（）方法，因为飞机不仅需要画出来，而且需要动！、
	//画自己
	public void drawSelf(Graphics g) {
		g.drawImage(img,(int) x,(int) y,height,width ,null);
		x++;
	}



		//加入构造器
		public   Plane( Image  img  ,double x ,double  y,int width,int height){
			
			this.img = img;
			this.x  = x;
			this.y = y;
			this.height = height;
			this.width = width;
			
		}
}
