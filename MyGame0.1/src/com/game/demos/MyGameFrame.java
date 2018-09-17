package com.game.demos;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;


/**
 * 飞机游戏窗口加载
 * 
 * @author 杜锋
 *
 */
public class MyGameFrame extends JFrame {

	/**
	 * 下一条语句是给MyGameFrame编号
	 */
	private static final long serialVersionUID = 1L;
	
	Image planeImg = GameUtil.getImage("images/plane1.png");
	Image space = GameUtil.getImage("images/space.jpg");
	

	Plane plane = new Plane(planeImg,200.0,400.0,30,20);
	
	@Override//调用父类中的方法可以直接使用！
	public void paint(Graphics g) {
		super.paint(g);// 黑屏问题所在！？？

		g.drawImage(space,0,0,null);
		plane.drawSelf(g);
	}
	
	//帮助我们反复画窗口
	class PaintThread extends Thread{
		@Override
		public void run() {
			while(true) {
				repaint();
				try {
					//1s = 1000ms
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
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


		// 增加关闭窗口监听，这样用户点击右上角关闭图标，可以关闭游戏程序
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//增加键盘监听功能
		class KeyClass extends KeyAdapter{

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("按下" + e.getKeyCode());
			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("松开" + e.getKeyCode());
			}
		}
			
		new PaintThread().start();//启动重画窗口的 线程
		addKeyListener(new KeyClass());//启动键盘监听
	}

	public static void main(String[] args) {

		MyGameFrame f = new MyGameFrame();
		f.lauchFrame();
	}
}
