package com.ploymorphism.myServlet;

public class Test {

	public static void main(String[] args) {
		HttpServlet a = new MyServlet();
		//多态
		a.Servlet();
		//问题：doGet指向那个对象
		//应该是指向MyServlet类的对象
		//因为this一直是指向最初的对象
		//分析内存！
	}
}
