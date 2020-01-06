package com.twilight.arraydemos;

import java.lang.reflect.Array;

/**
 * ��������Ķ���ͳ�ʼ��
 * @author �ŷ�
 *
 */
public class Test01 {

	public static void main(String[] args) {
		int[] array01 = new int[10];
		Person[] array03 = new Person[3];//Ĭ�ϳ�ʼ��
		//��ʼ���������Ա������ʼ����ֵһ�¡�
		
		array01[0] = 6;
		array01[1] = 12;
		array01[2] = 18;//��̬��ʼ��
		//array01[10] = 66; java.lang.ArrayIndexOutOfBoundsException: 10 ������Χ��

		Person[] array02 = {
				new Person(20,"�ŷ�",1001),
				new Person(18,"���ĺ�",1002),
				new Person(19,"������",1003)
		};//��̬��ʼ��
		for(int i = 3;i < array01.length;i++) {
			array01[i] = 6 * (i + 1);
		}
		for(int i = 0;i < array01.length;i++) {
			System.out.print(array01[i] + " ");
		}	
		array03[0] = new Person(20,"�ŷ�",1001);
		array03[1] = new Person(18,"���ĺ�",1002);
		array03[2] = new Person(19,"������",1003);

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
