package com.twilight.demo2;
/**
 * ���Լ̳нṹ�Լ�Instanceof
 * @author �ŷ�
 *
 *����Ҳ����Ϊ���࣬���࣬�������
 *java��ֻ�е��̳У���һ������ֻ��һ�����ࡣ���ӿ��ж�̳С�
 *����̳��˸�������з��������ԣ����˹��췽�������������ÿ���ֱ�ӵ��ã����縸��
 *                                                                ��˽�з��������ԣ�
 *����һ�������û��ʹ��extends�������ĸ�����Object�ࡣ
 */

public class TestExtends/*û���ֶ����常�����Ҳ�Ǽ̳е�object�࣬��ͨ��ctrl + T�鿴*/ {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.age = 12;
		stu.name = "�ŷ�";
		stu.id = 1001;
		stu.rest();//���Ե��ø�������Ժ���ͨ���������췽�����⣡
		
		Student stu2 = new Student("���ĺ�",19,1002);
		stu2.study();//���췽��������
		
		Person stu3 = new Person();
		//stu3.id = 1003;���಻������������ԡ�
		
		System.out.println(stu instanceof Student);//�ж���ߵĶ����Ƿ������ұߵ��࣡
		System.out.println(stu instanceof Person);//���ڣ�
		System.out.println(stu instanceof Object);//���ڣ�
		System.out.println(stu3 instanceof Student);//�����ڣ�
	}
}

class Person/*����*/{
	String name;
	int age;
	
	public void rest() {
		
		System.out.println("��Ϣһ�ᣡ");
	}
}

class Student /*����*/extends Person {
	int id;//������Լ�������
	
	public void study() {
		System.out.println("��Ϣ��Сʱ��");
		
	}
	public Student(String name,int age,int id) {
		
		this.name = name;
		this.age = age;
		this.id = id;
		
	}
	public Student() {}
}
