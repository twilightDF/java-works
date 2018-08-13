package com.twilight.shape;


import  java.awt.*;
import javax.swing.*;
 
public class BallGame extends JFrame {
     
    Image ball = Toolkit.getDefaultToolkit().getImage("Image/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("Image/desk.jpg");
     
    double  x=100;    //小球的横坐标
    double  y=100; //小球的纵坐标
    boolean right = true;//小球运动的方向
    
    //画窗口的方法
    public void paint(Graphics  g){
        System.out.println("窗口被画了一次！");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int)x, (int)y, null);
        
        
        if(right) {
        	x = x + 10;
        }else {
        	x = x - 10;
        }
        if(x>856-40-30) {
        	right = false;
        }
        if(x<0+40) {
        	right = true;
        }
        //40为桌子边宽度 30 为台球直径
        
    }
     
    //窗口加载
    void launchFrame(){
        setSize(856,500);
        setLocation(50,50);
        setVisible(true);
     
    //重画窗口。
    
    while(true) {
    	
    	repaint();
    	try {
    		
    		Thread.sleep(40);//40ms 1秒等于1000ms 每秒窗口重画25次。
    		
    		
    	}
    	catch(Exception e){
    		
    		e.printStackTrace();
    		
    		}
    	}
    }
    
    //main方法是程序执行的入口
    public static void main(String[] args){
        System.out.println();
        BallGame game = new BallGame();
        game.launchFrame();
    }
     
}
