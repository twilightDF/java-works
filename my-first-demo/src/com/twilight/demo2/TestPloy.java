package com.twilight.demo2;
/**
 * ���Զ�̬
 * @author �ŷ�
 *���ɶ�̬����������
 *1.Ҫ�м̳�
 *2.Ҫ����д
 *3.�������ø�������õ�������ķ���
 */
public class TestPloy {

	public static void main(String[] args) {

		Cat c = new Cat();
		animalCry(c);
		animalCry(new Dog());//animal������Ϊ���࣬���ڴ���������ĵĶ��󡣹��ɶ�̬
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
}

class Dog extends Animal{
	public void shout() {
		System.out.println("��������");
	}
}