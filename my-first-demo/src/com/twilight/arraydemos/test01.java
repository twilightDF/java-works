package com.twilight.arraydemos;

import java.lang.reflect.Array;

/**
 * 测试数组的定义和初始化
 * @author 杜锋
 *
 */
public class test01 {

	public static void main(String[] args) {
		int[] array01 = new int[10];
		String[] array02 = new String[5];
		Person[] array03 = new Person[3];
		
		array01[0] = 6;
		array01[1] = 12;
		array01[2] = 18;
		//array01[10] = 66; java.lang.ArrayIndexOutOfBoundsException: 10 超出范围！
		
		for(int i = 3;i < array01.length;i++) {
			array01[i] = 6 * (i + 1);
		}
		for(int i = 0;i < array01.length;i++) {
			System.out.print(array01[i] + " ");
		}	
		array03[0] = new Person(20,"杜锋",1001);
		array03[1] = new Person(18,"封文豪",1002);
		array03[2] = new Person(19,"封文婷",1003);

		System.out.println();
		for(int i = 0;i < array03.length;i++) {
			System.out.println(array03[i].getName());
		}
	}
}

class Person{
	private int age;
	private String name;
	private int id;
	public Person(int age, String name, int id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
