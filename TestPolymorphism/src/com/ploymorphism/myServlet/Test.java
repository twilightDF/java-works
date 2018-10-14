package com.ploymorphism.myServlet;

public class Test {

	public static void main(String[] args) {
		HttpServlet a = new MyServlet();
		//为什么这个也叫多态？
		//多态不是父类引用指向子类对象吗？
		a.Servlet();
		//问题：doGet指向那个对象
		//应该是指向MyServlet类的对象
		//因为this一直是指向最初的对象
		//分析内存！
	}
}
