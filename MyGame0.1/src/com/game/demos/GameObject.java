package com.game.demos;
/**
 * ��Ϸ����ĸ���
 * @author �ŷ�
 *
 */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class GameObject {

	Image img;
	double x,y;
	int height,width;
	int speed;
	
	//���Լ�
	public void drawSelf(Graphics g) {
		g.drawImage(img,(int) x,(int) y, width,height, null);
	}

	//������
	public GameObject(Image img, double x, double y, int width,int height,int speed) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed = speed;
	}

	public GameObject(Image img, double x, double y) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
	}
	
	public GameObject() {
	}
	/**
	* ���������Ӧ�������򣬱��ں�������ײ�����ʹ��
	* @return
	*/
	public Rectangle getRect(){
	      return  new Rectangle((int)x,(int) y, width, height);
	}  
}
