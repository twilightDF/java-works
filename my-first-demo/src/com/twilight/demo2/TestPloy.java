package com.twilight.demo2;
/**
 * 测试多态
 * @author 杜锋
 *构成多态的三个条件
 *1.要有继承
 *2.要有重写
 *3.必须是用父类的引用调用子类的对象
 */
public class TestPloy {

	public static void main(String[] args) {

		Animal c = new Cat();
		animalCry(c);
		animalCry(new Dog());//animal引用类为父类，现在传入多个子类的的对象。构成多态
		
		//对象的转型
		/*
		 * 例如：Animal c = new Cat();
		 * 虽表面上c是Cat类 但实际上是animal类
		 * 这就是向上自动转型
		 * 但此时c 无法调用他自己类的方法 c.sleep报错
		 * 这时需要向下强制转型
		 */
		Cat c2 = (Cat)c;
		c2.sleep();
	}
	static void animalCry(Animal a) {
		 a.shout();
	}

}
class Animal{
	public void shout(){
		System.out.println("叫一声！~~");
	}
}

class Cat extends Animal{
	public void shout() {
		System.out.println("喵喵喵！");
	}
	public void sleep() {
		System.out.println("猫在睡觉！");
	}
}

class Dog extends Animal{
	public void shout() {
		System.out.println("汪汪汪！");
	}
}