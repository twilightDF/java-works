package com.game.demos;

import java.awt.*;
import javax.swing.JFrame; 
/**
 * �ɻ���Ϸ���ڼ���
 * @author �ŷ�
 *
 */
public class MyGameFrame extends JFrame {


	@Override
		public void paint(Graphics g) {
		g.drawLine(100, 100, 300, 300);
		g.fillRect(100, 100, 100, 100);
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
		}
	
	   //���ӹرմ��ڼ����������û�������Ͻǹر�ͼ�꣬���Թر���Ϸ����
  /*addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });����*/


	
	public static void main(String[] args){

		MyGameFrame f = new MyGameFrame();
		f.lauchFrame();
		}
}
