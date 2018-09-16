package cn.sxt.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyGameFrame extends JFrame {
	private Image planeImg = GameUtil.getImage("images/rocket-ship.png");
	private Image bgImg = GameUtil.getImage("images/blue-galaxy.jpg");
	private Image offScreenImage = null;
	Plane plane = new Plane(planeImg, 300.0, 300.0, 10);
	ArrayList<Shell> shellList = new ArrayList<Shell>();
	Explode bao;//������ը����
	Date startTime = new Date();    //��Ϸ��ʼʱ��
	Date endTime;  //��Ϸ����ʱ��
	
	// ����Ϊ�ڲ��࣬���Է����ʹ���ⲿ�����ͨ����
	class KeyMonitor extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			plane.addDirection(e);
			// repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			plane.minusDirection(e);
			// repaint();
		}
	}

	class PaintThread extends Thread {
		public void run() {
			while (true) {
				repaint();
				try {
					// 1s = 1000ms
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void update(Graphics g) {
		if (offScreenImage == null)
			offScreenImage = this.createImage(500, 500);// ������Ϸ���ڵĿ�Ⱥ͸߶�

		Graphics gOff = offScreenImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreenImage, 0, 0, null);
	}

	@Override
	public void paint(Graphics g) {

		super.paint(g);
		
		
		if(!plane.live){
			if (bao == null) {
				bao = new Explode(plane.x, plane.y);
			}
			bao.draw(g);
			
            if(endTime==null){
                endTime = new Date();
            }
            int period = (int)((endTime.getTime()-startTime.getTime())/1000);
            printInfo(g, "ʱ�䣺"+period+"��", 50, 120, 260, Color.white);
        } else {
        	double w = g.getClipBounds().getWidth();
    		double h = g.getClipBounds().getHeight();

    		g.drawImage(bgImg, 0, 0, (int) w, (int) h, null);

    		plane.drawMySelf(g);

    		// �������������е��ӵ�
    		for (int i = 0; i < shellList.size(); i++) {
    			Shell b = shellList.get(i);
    			b.draw(g);

    			// �ɻ��������ڵ�������о��μ��
    			boolean peng = b.getRect().intersects(plane.getRect());
    			if (peng) {
    				plane.live = false; // �ɻ�����,���治��ʾ
    			}
    		}
        }
		
	}

	public void printInfo(Graphics g,String str,int size,int x,int y,Color color){
        Color c = g.getColor();
        g.setColor(color);
        Font f = new Font("����",Font.BOLD,size);
        g.setFont(f);
        g.drawString(str,x,y);
        g.setColor(c);
    }  
	
	public void launchFrame() {
		// ����Ϸ���ڴ�ӡ����
		setTitle("��ѧ��ѧԱ_����Գ��Ʒ");
		// ����Ĭ�ϲ��ɼ�����Ϊ�ɼ�
		setVisible(true);
		// ���ڴ�С�����500���߶�500
		setSize(500, 500);
		// �������ϽǶ��������λ��
		setLocation(300, 300);

		// ���ӹرմ��ڼ����������û�������Ͻǹر�ͼ�꣬���Թر���Ϸ����
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		addKeyListener(new KeyMonitor());// ���Ӽ��̵ļ���

		for (int i = 0; i < 50; i++) {
			Shell b = new Shell();
			shellList.add(b);
		}

		// ����������������ϸ��汾һ�£�����ƪ����ֻ��ʾ�����Ĵ���
		new PaintThread().start(); // �����ػ��߳�
	}

	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
