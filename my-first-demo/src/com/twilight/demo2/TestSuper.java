package com.twilight.demo2;
/**
 * ����super�������෽��������
 * @author �ŷ�
 *
 */
public class TestSuper {

	public static void main(String[] args){
		new Child().f();//�������󲢵���f()����
		new Child();//�����˼̳���׷�ݡ�
		
	}
	
	
	
}

class Father{
	int value;
	public void f(){
		value = 100;
		System.out.println("���ø���value= :" + value);
	}
	public Father() {
		//�ڹ��췽���еĵ�һ������super();
		System.out.println("�����˸���");
	}
	
}

class Child extends Father{
	int value;
	public void f(){
		super.f();//���ø�����ͨ������
		value = 200;
		System.out.println("��������value= :" + value);
	}
	public Child() {
		//���췽���ص���һ������super();
		System.out.println("����������");
	}
}