package com.game.demos;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
	
	@Override//���ø����еķ�������ֱ��ʹ�ã�
	public void paint(Graphics g) {
		super.paint(g);// �����������ڣ�����

		g.drawImage(space,0,0,null);
		plane.drawSelf(g);
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
		
		this.setTitle("�ɻ�С����");
		this.setVisible(true);
		this.setSize(500, 500);
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
				System.out.println("����" + e.getKeyCode());
			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("�ɿ�" + e.getKeyCode());
			}
		}
			
		new PaintThread().start();//�����ػ����ڵ� �߳�
		addKeyListener(new KeyClass());//�������̼���
	}

	public static void main(String[] args) {

		MyGameFrame f = new MyGameFrame();
		f.lauchFrame();
	}
}
