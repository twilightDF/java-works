package com.twilight.demo2;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * ���Լ��̼���
 * @author �ŷ�
 * 
 *
 */
public class KeyMonitor extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void lauchFrame() {
		this.setTitle("�ɻ�С����");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(700, 300);
		
		addKeyListener(new KeyClass());
		
		// ���ӹرմ��ڼ����������û�������Ͻǹر�ͼ�꣬���Թر���Ϸ����
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		
		KeyMonitor f = new KeyMonitor();
		f.lauchFrame();
		
	}

	//���̼���
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
}
