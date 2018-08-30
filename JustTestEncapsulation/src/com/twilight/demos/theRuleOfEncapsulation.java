package com.twilight.demos;
/**
 * 封装的一些使用规则
 * @author 杜锋
 *
 */
public class theRuleOfEncapsulation {
	public static void main(String[] args) {

		Person p = new Person();
		p.getName("杜锋");
		p.getAge(20);
		System.out.println(p.setName());
		System.out.println(p.setAge());
	}

}

class Person{

	//一般来说类的属性都私有，只暴露其方法
	 private int age;
	private String name;
	private int height;
	private String address;
	
	//如果其他类需要调用本类的方法，使用get或set方法
	public void getName(String name) {
		this.name = name;
	}
	
	public String setName() {
		return name;
	}
	public void getAge(int age) {
		this.age = age;
	}
	public int setAge() {
		return age;
	}
	
	
	
	
	
	
	
	//
}