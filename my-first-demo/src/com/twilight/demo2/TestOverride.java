package com.twilight.demo2;
/**
 * 测试方法的重写（override）
 * @author 杜锋
 * 
 *
 */
public class TestOverride {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.run();
		v.stop();
		
		Horse h = new Horse();
		h.run();
		h.stop();
	}
	
}

class Vehicle{
	
	public void run() {
		System.out.println("跑....");
	}

	public void stop() {
		System.out.println("停下！");
	}
	//返回类型子类小于等于父类
	public Person whoIs() {
		return new Person();
	}
	
}

class Horse extends Vehicle{
	
	public void run() {
		System.out.println("驾~");
		}
	public void  stop() {
		System.out.println("吁~");
	}
	//返回类型子类小于等于父类
	public Student WhoIs() {
		return new Student();
	}
	
}