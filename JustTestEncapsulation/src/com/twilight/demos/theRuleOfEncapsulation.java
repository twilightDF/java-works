package com.twilight.demos;
/**
 * 封装的一些使用规则
 * @author 杜锋
 *
 */
public class theRuleOfEncapsulation {
	public static void main(String[] args) {

		Person p = new Person();
		p.setName("杜锋");
		p.setAge(20);
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}

}

class Person{

	//一般来说类的属性都私有，只暴露其方法
	private int age;
	private String name;
	private int height;
	private String address;
	
	//如果其他类需要调用本类的方法，使用get或set方法
	//可以使用系统快捷shift + alt + s自动构造
	public int getAge() {
		return age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {

		if(age <= 0||age >= 140) {
			System.out.println("请输入正常的年龄！");
		}else {
			this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}