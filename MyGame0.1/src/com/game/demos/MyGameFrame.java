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
 * �ɻ���Ϸ���ڼ���
 * 
 * @author �ŷ�
 *
 */
public class MyGameFrame extends JFrame {

	/**
	 * ��һ������Ǹ�MyGameFrame���
	 */
	private static final long serialVersionUID = 1L;
	
	Image planeImg = GameUtil.getImage("images/plane1.png");
	Image space = GameUtil.getImage("images/space.jpg");
	

	Plane plane = new Plane(planeImg,200.0,400.0,30,20);
	
	Shell[] shells = new Shell[30];
	//������Ϸʱ��
	Date startTime = new Date();
	Date endTime;
	int period ;
	@Override//���ø����еķ�������ֱ��ʹ�ã�
	public void paint(Graphics g) {
		super.paint(g);// �����������ڣ�����

		g.drawImage(space,0,0,null);
		plane.drawSelf(g);
		
		for(int i = 0; i< shells.length;i++) {
		shells[i].drawSelf(g);
		
		//�����ײ
		boolean peng  = shells[i].getRect().intersects(plane.getRect());
		if(peng) {
			endTime = new Date();
			plane.live = false;
			period =  (int)((endTime.getTime() - startTime.getTime())/1000);
		}
		}
		if(plane.live == false) {
			g.setColor(Color.red);
			g.drawString("��Ϸʱ�䣺 "+ period,250, 250);
		}
	}
	
	//�������Ƿ���������
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
	 * ��ʼ�����ڣ�
	 * 
	 */
	public void lauchFrame() {
		
		System.out.println(plane.getRect());
		this.setTitle("�ɻ�С����");
		this.setVisible(true);
		this.setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
		this.setLocation(700, 300);
		// ���ӹرմ��ڼ����������û�������Ͻǹر�ͼ�꣬���Թر���Ϸ����
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//���Ӽ��̼�������
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
			
		new PaintThread().start();//�����ػ����ڵ� �߳�
		addKeyListener(new KeyClass());//�������̼���
		
		//����30���ڵ�����
				for(int i = 0;i < shells.length;i++){
					shells[i] = new Shell();
				}
	}

	public static void main(String[] args) {

		MyGameFrame f = new MyGameFrame();
		f.lauchFrame();
	
	}
	 
}
