package com.twilight.demos;
/**
 * ��װ��һЩʹ�ù���
 * @author �ŷ�
 *
 */
public class theRuleOfEncapsulation {
	public static void main(String[] args) {

		Person p = new Person();
		p.getName("�ŷ�");
		p.getAge(20);
		System.out.println(p.setName());
		System.out.println(p.setAge());
	}

}

class Person{

	//һ����˵������Զ�˽�У�ֻ��¶�䷽��
	 private int age;
	private String name;
	private int height;
	private String address;
	
	//�����������Ҫ���ñ���ķ�����ʹ��get��set����
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