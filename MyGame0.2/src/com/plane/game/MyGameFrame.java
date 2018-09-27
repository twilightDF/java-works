package com.plane.game;

import java.awt.Color;//������ɫ��
import java.awt.Font;//���������
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * �ɻ���Ϸ���ڼ���
 * 
 * @author �ŷ�
 *
 */
public  class MyGameFrame extends JFrame {

	Image ball = GameUtil.getImage("images/huojian.png");
	Image space = GameUtil.getImage("iamges/space.jpg");
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);// �����������ڣ�����

		g.drawImage(ball, 100, 100, null);
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

		this.setBackground(new Color(0, 255, 0));

		// ���ӹرմ��ڼ����������û�������Ͻǹر�ͼ�꣬���Թر���Ϸ����
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
