package com.plane.game;

import java.awt.Color;//导入颜色包
import java.awt.Font;//导入字体包
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 飞机游戏窗口加载
 * 
 * @author 杜锋
 *
 */
public  class MyGameFrame extends JFrame {

	Image ball = GameUtil.getImage("images/huojian.png");
	Image space = GameUtil.getImage("iamges/space.jpg");
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);// 黑屏问题所在！？？

		g.drawImage(ball, 100, 100, null);
	}
	

	/**
	 * 初始化窗口！
	 * 
	 */
	public void lauchFrame() {
		this.setTitle("飞机小程序");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(700, 300);

		this.setBackground(new Color(0, 255, 0));

		// 增加关闭窗口监听，这样用户点击右上角关闭图标，可以关闭游戏程序
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public static void main(String[] args) {

		MyGameFrame f = new MyGameFrame();
		f.lauchFrame();
	}
}
