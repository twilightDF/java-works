package com.game.demos;

import java.awt.Graphics;
import java.awt.Image;

public class Plane extends GameObject {

	//��д���������drawSelf������������Ϊ�ɻ�������Ҫ��������������Ҫ������
	//���Լ�
	public void drawSelf(Graphics g) {
		g.drawImage(img,(int) x,(int) y,height,width ,null);
		x++;
	}



		//���빹����
		public   Plane( Image  img  ,double x ,double  y,int width,int height){
			
			this.img = img;
			this.x  = x;
			this.y = y;
			this.height = height;
			this.width = width;
			
		}
}
