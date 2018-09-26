package com.ploymorphism.myServlet;
/**
 * 深层次理解多态
 * @author 杜锋
 *
 */
public class HttpServlet {

	public void Servlet() {
		System.out.println("HttpServlet.servlet");
		doGet();
		//实际上是this.doGet
	}
	
	public void doGet() {
		System.out.println("HttpServlet.doGet");
	}
	
}
