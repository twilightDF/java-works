package com.twilight.interfacedemos;
//一个类可以实现多个接口
public class Man implements FlyAble,AttackAble{

	public void fly() {

		System.out.println("挑起来飞！");
	}
	public void attack() {

		System.out.println("用拳头打！");
	}


}
