package com.game.demos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

public class Plane extends GameObject {

	boolean left,right,up,down;
	
	int speed = 8;
	boolean live = true;
	//��д���������drawSelf������������Ϊ�ɻ�������Ҫ��������������Ҫ������
	//���Լ�
	public void drawSelf(Graphics g) {
		g.drawImage(img,(int) x,(int) y,height,width ,null);

		if(live) {
			if (left) {
				x -= speed;
			}

			if (right) {
				x += speed;
			}

			if (up) {
				y -= speed;
			}

			if (down) {
				y += speed;
			}
		}else {
			Color c = g.getColor();
			Font f = g.getFont();
			g.setColor(Color.pink);
			g.setFont(new Font("����",Font.BOLD,20));
			
			g.drawString("�����ˣ�ɵ��", Constant.GAME_WIDTH/2,Constant.GAME_HEIGHT/2 );
			g.setColor(c);
			g.setFont(f);
		}
		
	}



		//���빹����
		public   Plane( Image  img  ,double x ,double  y,int width,int height){
			
			this.img = img;
			this.x  = x;
			this.y = y;
			this.height = height;
			this.width = width;
			
		}
		
		public Plane() {
			
		}
		
		public  void addDirction(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				left = true;
				break;
			case KeyEvent.VK_RIGHT:
				right = true;
				break;
			case KeyEvent.VK_UP:
				up = true;
				break;
			case KeyEvent.VK_DOWN:
				down = true;
				break;
			}
		}
		public  void minusDirction(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				left = false;
				break;
			case KeyEvent.VK_RIGHT:
				right = false;
				break;
			case KeyEvent.VK_UP:
				up = false;
				break;
			case KeyEvent.VK_DOWN:
				down = false;
				break;
			}
		}
}
