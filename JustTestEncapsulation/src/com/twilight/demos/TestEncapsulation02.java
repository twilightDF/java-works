package com.twilight.demos;
/**
 * ���Է�װ
 * @author �ŷ�
 *
 */
public class TestEncapsulation02 {

	public static void main(String[] args) {

		Human h = new Human();
		h.name = "���ĺ�";//default���α����п��Ե���
		TestEncapsulation a = new TestEncapsulation();
		a.height = 182;//heightΪdefault���ͣ�ͬһ���¿��Է��ʡ�
		a.id = 1001;//idΪprotected���ͣ�ͬһ���¿��Է��ʡ�
				}
}
