package com.twilightDF.demos;

public class SxtStu {
	//属性
	int age;
	String name;
	int ID;
	
	Computer comp;
	//构造方法，用于创建这个类的对象。无参的构造方法可以由系统自动创建！
	SxtStu(){
		
	}
	//方法
	void study() {
		System.out.println("我在学习！使用电脑："+comp.brand  );//引用其他的类
	}

	void play() {
		System.out.println("我在玩游戏！");
	}
	//程序入口javac       java SxtStu 
	public static void main(String[] args)/*一个方法  main 方法*/ {
		
		//建立对象
		SxtStu stu = new SxtStu();
		stu.age = 20;
		stu.name = "杜锋";
		stu.ID = 1001;
		
		
		//new一个Computer方法里的新对象，再赋值给局部变量c1！
		Computer c1 = new Computer("联想");
		
		//此时c1局部变量就是一个对象，具有相应的属性和方法！
		
		//将c1赋值给stu对象里的comp属性！
		stu.comp = c1;
		
		/**
		 * 问题：既然c1与comp一样，为何要多此一举创建comp？
		 */
		
		//调用stu对象里的study（）方法！
		stu.study();		
	}
	
}

class Computer{
	
	//构造方法！有参
	Computer(String brand){
		this.brand = brand;
	}
	
	String brand;
	 
}
