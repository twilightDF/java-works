package com.ploymorphism.myServlet;
/**
 * ��������̬
 * @author �ŷ�
 *
 */
public class HttpServlet {

	public void Servlet() {
		System.out.println("HttpServlet.servlet");
		doGet();
		//ʵ������this.doGet
	}
	
	public void doGet() {
		System.out.println("HttpServlet.doGet");
	}
	
}
