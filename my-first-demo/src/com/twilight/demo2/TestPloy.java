package com.twilight.demo2;
/**
 * 测试多态
 * @author 杜锋
 *构成多态的三个条件
 *1.要有继承
 *2.要有重写
 *3.必须是用父类的引用调用子类的方法
 */
public class TestPloy {

	public static void main(String[] args) {

		Cat c = new Cat();
		animalCry(c);
		animalCry(new Dog());//animal引用类为父类，现在传入多个子类的的对象。构成多态
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
}

class Dog extends Animal{
	public void shout() {
		System.out.println("汪汪汪！");
	}
}