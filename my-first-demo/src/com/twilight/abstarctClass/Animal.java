package com.twilight.abstarctClass;
/**
 * 抽象类测试
 * @author 杜锋
 *要点
 *1，抽象类只能用于继承，不能通过new用于其他类创建对象。
 *2，子类必须要有父类方法调用
 *3，有抽象方法的类值只能是抽象类
 *意义
 *通过抽象类实现了将方法的声明和实现分开了
 *可以避免子类方法的随意性！
 */
public abstract class  Animal {


	public abstract void run();
	
	public void Sleep() {
		run();//通过多态实现！
	}
	//抽象类里可以创建普通的方法!
	int a ;
	//可以创建属性
}



class Cat extends Animal{
	
	public void run() {
	
		System.out.println("猫跑！");
	}
}
