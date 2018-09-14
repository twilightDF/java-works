package com.game.demos;

import java.awt.*;
import javax.swing.JFrame; 
/**
 * 飞机游戏窗口加载
 * @author 杜锋
 *
 */
public class MyGameFrame extends JFrame {


	@Override
		public void paint(Graphics g) {
		g.drawLine(100, 100, 300, 300);
		g.fillRect(100, 100, 100, 100);
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
		}
	
	   //增加关闭窗口监听，这样用户点击右上角关闭图标，可以关闭游戏程序
  /*addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });错误！*/


	
	public static void main(String[] args){

		MyGameFrame f = new MyGameFrame();
		f.lauchFrame();
		}
}
