package com.twilight.demo2;
/**
 * ���Է�������д��override��
 * @author �ŷ�
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
		System.out.println("��....");
	}

	public void stop() {
		System.out.println("ͣ�£�");
	}
	//������������С�ڵ��ڸ���
	public Person whoIs() {
		return new Person();
	}
	
}

class Horse extends Vehicle{
	
	public void run() {
		System.out.println("��~");
		}
	public void  stop() {
		System.out.println("��~");
	}
	//������������С�ڵ��ڸ���
	public Student WhoIs() {
		return new Student();
	}
	
}