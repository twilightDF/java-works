package com.twilightDF.demos;

public class SxtStu {
	//����
	int age;
	String name;
	int ID;
	
	Computer comp;
	//���췽�������ڴ��������Ķ����޲εĹ��췽��������ϵͳ�Զ�������
	SxtStu(){
		
	}
	//����
	void study() {
		System.out.println("����ѧϰ��ʹ�õ��ԣ�"+comp.brand );//������������
	}

	void play() {
		System.out.println("��������Ϸ��");
	}
	//�������javac       java SxtStu 
	public static void main(String[] args)/*һ������  mian ����*/ {
		
		//��������
		SxtStu stu = new SxtStu();
		stu.age = 20;
		stu.name = "�ŷ�";
		stu.ID = 1001;
		
		
		//newһ��Computer��������¶����ٸ�ֵ���ֲ�����c1��
		Computer c1 = new Computer();
		
		//��ʱc1�ֲ���������һ�����󣬾�����Ӧ�����Ժͷ�����
		c1.brand = "����";
		
		//��c1��ֵ��stu�������comp���ԣ�
		stu.comp = c1;
		
		//����stu�������study����������
		stu.study();		
	}
	
}

class Computer{
	
	//���췽�����޲�
	Computer(){
		
	}
	
	String brand;
	 
}