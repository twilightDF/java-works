package com.twilight.demo2;
/**
 * ���Զ�̬
 * @author �ŷ�
 *���ɶ�̬����������
 *1.Ҫ�м̳�
 *2.Ҫ����д
 *3.�������ø�������õ�������Ķ���
 */
public class TestPloy {

	public static void main(String[] args) {

		Animal c = new Cat();
		animalCry(c);
		animalCry(new Dog());//animal������Ϊ���࣬���ڴ���������ĵĶ��󡣹��ɶ�̬
		
		//�����ת��
		/*
		 * ���磺Animal c = new Cat();
		 * �������c��Cat�� ��ʵ������animal��
		 * ����������Զ�ת��
		 * ����ʱc �޷��������Լ���ķ��� c.sleep����
		 * ��ʱ��Ҫ����ǿ��ת��
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
		System.out.println("��һ����~~");
	}
}

class Cat extends Animal{
	public void shout() {
		System.out.println("��������");
	}
	public void sleep() {
		System.out.println("è��˯����");
	}
}

class Dog extends Animal{
	public void shout() {
		System.out.println("��������");
	}
}