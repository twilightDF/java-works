package com.twilight.interfacedemos;
//һ�������ʵ�ֶ���ӿ�
public class Man implements FlyAble,AttackAble{

	@Override
	public void fly() {

		System.out.println("�������ɣ�");
	}

	@Override
	public void attack() {

		System.out.println("��ȭͷ��");
	}


}
