package com.game.demos;
/**
 * 游戏物体的父类
 * @author 杜锋
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
	
	//画自己
	public void drawSelf(Graphics g) {
		g.drawImage(img,(int) x,(int) y, width,height, null);
	}

	//构造器
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
	* 返回物体对应矩形区域，便于后续在碰撞检测中使用
	* @return
	*/
	public Rectangle getRect(){
	      return  new Rectangle((int)x,(int) y, width, height);
	}  
}
