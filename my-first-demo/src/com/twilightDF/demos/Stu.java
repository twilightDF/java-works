package com.twilightDF.demos;

public class Stu {
	
	//����
	int age;
	String name;
	int ID;
	
	//����
	void Study() {
		
		System.out.println("��������ѧϰ��");
		
	}
	 
	void Play() {
		
		System.out.println("��������Ϸ������ũҩ��");
	
	}
	
	//mian ���� һ���������ڣ�����Ҫ�У�
	public static void mian(String[] args) {
	
		
		//newһ������
		Stu student = new Stu();
		//���ö�����ķ�����
		student.Play();
		
	}
}
