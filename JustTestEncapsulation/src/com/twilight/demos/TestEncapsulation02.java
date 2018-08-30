package com.twilight.demos;
/**
 * 测试封装
 * @author 杜锋
 *
 */
public class TestEncapsulation02 {

	public static void main(String[] args) {

		Human h = new Human();
		h.name = "封文豪";//default修饰本包中可以调用
		TestEncapsulation a = new TestEncapsulation();
		a.height = 182;//height为default类型，同一包下可以访问。
		a.id = 1001;//id为protected类型，同一包下可以访问。
				}
}
