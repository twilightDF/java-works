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
	Explode bao;//创建爆炸对象
	Date startTime = new Date();    //游戏起始时刻
	Date endTime;  //游戏结束时刻
	
	// 定义为内部类，可以方便的使用外部类的普通属性
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
			offScreenImage = this.createImage(500, 500);// 这是游戏窗口的宽度和高度

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
            printInfo(g, "时间："+period+"秒", 50, 120, 260, Color.white);
        } else {
        	double w = g.getClipBounds().getWidth();
    		double h = g.getClipBounds().getHeight();

    		g.drawImage(bgImg, 0, 0, (int) w, (int) h, null);

    		plane.drawMySelf(g);

    		// 画出容器中所有的子弹
    		for (int i = 0; i < shellList.size(); i++) {
    			Shell b = shellList.get(i);
    			b.draw(g);

    			// 飞机和所有炮弹对象进行矩形检测
    			boolean peng = b.getRect().intersects(plane.getRect());
    			if (peng) {
    				plane.live = false; // 飞机死掉,画面不显示
    			}
    		}
        }
		
	}

	public void printInfo(Graphics g,String str,int size,int x,int y,Color color){
        Color c = g.getColor();
        g.setColor(color);
        Font f = new Font("宋体",Font.BOLD,size);
        g.setFont(f);
        g.drawString(str,x,y);
        g.setColor(c);
    }  
	
	public void launchFrame() {
		// 在游戏窗口打印标题
		setTitle("尚学堂学员_程序猿作品");
		// 窗口默认不可见，设为可见
		setVisible(true);
		// 窗口大小：宽度500，高度500
		setSize(500, 500);
		// 窗口左上角顶点的坐标位置
		setLocation(300, 300);

		// 增加关闭窗口监听，这样用户点击右上角关闭图标，可以关闭游戏程序
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		addKeyListener(new KeyMonitor());// 增加键盘的监听

		for (int i = 0; i < 50; i++) {
			Shell b = new Shell();
			shellList.add(b);
		}

		// 本方法其他代码和上个版本一致，限于篇幅，只显示新增的代码
		new PaintThread().start(); // 启动重画线程
	}

	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
