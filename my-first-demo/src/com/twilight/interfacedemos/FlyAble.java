package com.twilight.interfacedemos;

/**
 * 测速接口
 * @author 杜锋
 * 什么是接口：
 * 接口就是比抽象类更加抽象的“抽象类”
 * 抽象类还可以定义方法体，但在接口里就不行了，其他的与抽象类一样。
 * 也不能被创建对象！
 * 接口中只有常量和抽象方法。
 * 意义：
 * 也是实现了设计与实现的分离，规范了之实现类的各种属性！
 *
 */
//定义一个接口
public interface FlyAble {

	//定义常量
	/*public static final   写与不写多会自动加上*/int MIN_HEIGHT = 1;
	
	/*public abstract    写与不写多会自动加上*/void fly();
	/*没有方法体！*/
	
}

 interface AttackAble{
	
	void  attack();
}
 
 /**接口支持多继承！*/
 interface A{
	 void 	 a();
 }
 
 interface B{
	 void b();
	 
 }
 
 //接口C继承了A，B两个接口，拥有A，B两个接口的抽象方法和常量!
 //当然还有自己的抽象方法和常量！
 interface C extends A,B{
	 void c();
 }
 
 
 //如果此时一个类实现了C接口，那么他也一定要实现A,B接口
 
 class Test implements C{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}
	 
 }
 
 
 
 
 
 
 
 
