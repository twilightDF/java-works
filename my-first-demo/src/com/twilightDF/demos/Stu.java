package com.twilightDF.demos;

public class Stu {
	
	//属性
	int age;
	String name;
	int ID;
	
	//方法
	void Study() {
		
		System.out.println("我在认真学习！");
		
	}
	 
	void Play() {
		
		System.out.println("我在玩游戏，王者农药！");
	
	}
	
	//mian 方法 一个程序的入口，必须要有！
	public static void mian(String[] args) {
	
		
		//new一个对象！
		Stu student = new Stu();
		//调用对象里的方法！
		student.Play();
		
	}
}
