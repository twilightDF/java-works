package com.twilight.demos;
/**
 * ��װ��һЩʹ�ù���
 * @author �ŷ�
 *
 */
public class theRuleOfEncapsulation {
	public static void main(String[] args) {

		Person p = new Person();
		p.setName("�ŷ�");
		p.setAge(20);
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}

}

class Person{

	//һ����˵������Զ�˽�У�ֻ��¶�䷽��
	private int age;
	private String name;
	private int height;
	private String address;
	
	//�����������Ҫ���ñ���ķ�����ʹ��get��set����
	//����ʹ��ϵͳ���shift + alt + s�Զ�����
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
			System.out.println("���������������䣡");
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