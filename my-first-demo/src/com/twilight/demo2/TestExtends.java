package com.twilight.demo2;
/**
 * 测试继承结构以及Instanceof
 * @author 杜锋
 *
 *父类也被称为超类，基类，派生类等
 *java中只有单继承，即一个子类只有一个父类。但接口有多继承。
 *子类继承了父类的所有方法和属性（除了构造方法），但不见得可以直接调用（比如父类
 *                                                                的私有方法和属性）
 *定义一个类如果没有使用extends，则他的父类是Object类。
 */

public class TestExtends/*没有手动定义父类的类也是继承的object类，可通过ctrl + T查看*/ {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.age = 12;
		stu.name = "杜锋";
		stu.id = 1001;
		stu.rest();//可以调用父类的属性和普通方法，构造方法除外！
		
		Student stu2 = new Student("封文豪",19,1002);
		stu2.study();//构造方法的作用
		
		Person stu3 = new Person();
		//stu3.id = 1003;父类不能用子类的属性。
		
		System.out.println(stu instanceof Student);//判断左边的对象是否属于右边的类！
		System.out.println(stu instanceof Person);//属于！
		System.out.println(stu instanceof Object);//属于！
		System.out.println(stu3 instanceof Student);//不属于！
	}
}

class Person/*父类*/{
	String name;
	int age;
	
	public void rest() {
		
		System.out.println("休息一会！");
	}
}

class Student /*子类*/extends Person {
	int id;//子类的自己的属性
	
	public void study() {
		System.out.println("休息两小时！");
		
	}
	public Student(String name,int age,int id) {
		
		this.name = name;
		this.age = age;
		this.id = id;
		
	}
	public Student() {}
}
