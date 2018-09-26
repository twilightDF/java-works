package com.game.demos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

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
	
	Shell[] shells = new Shell[30];
	//计算游戏时间
	Date startTime = new Date();
	Date endTime;
	int period ;
	@Override//调用父类中的方法可以直接使用！
	public void paint(Graphics g) {
		super.paint(g);// 黑屏问题所在！？？

		g.drawImage(space,0,0,null);
		plane.drawSelf(g);
		
		for(int i = 0; i< shells.length;i++) {
		shells[i].drawSelf(g);
		
		//检测碰撞
		boolean peng  = shells[i].getRect().intersects(plane.getRect());
		if(peng) {
			endTime = new Date();
			plane.live = false;
			period =  (int)((endTime.getTime() - startTime.getTime())/1000);
		}
		}
		if(plane.live == false) {
			g.setColor(Color.red);
			g.drawString("游戏时间： "+ period,250, 250);
		}
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
		
		System.out.println(plane.getRect());
		this.setTitle("飞机小程序");
		this.setVisible(true);
		this.setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
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
				plane.addDirction(e);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				plane.minusDirction(e);
			}
		}
			
		new PaintThread().start();//启动重画窗口的 线程
		addKeyListener(new KeyClass());//启动键盘监听
		
		//生成30个炮弹对象
				for(int i = 0;i < shells.length;i++){
					shells[i] = new Shell();
				}
	}

	public static void main(String[] args) {

		MyGameFrame f = new MyGameFrame();
		f.lauchFrame();
	
	}
	 
}
