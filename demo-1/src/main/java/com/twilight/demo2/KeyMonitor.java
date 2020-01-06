package com.twilight.demo2;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 测试键盘监听
 * @author 杜锋
 * 
 *
 */
public class KeyMonitor extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void lauchFrame() {
		this.setTitle("飞机小程序");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(700, 300);
		
		addKeyListener(new KeyClass());
		
		// 增加关闭窗口监听，这样用户点击右上角关闭图标，可以关闭游戏程序
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

	//键盘监听
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
}
