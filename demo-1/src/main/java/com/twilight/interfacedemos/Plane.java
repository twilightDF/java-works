package com.twilight.interfacedemos;
/**使用其他的类来实现接口
 * 并且必须实现！
 * */
public class Plane implements FlyAble{

	public void fly() {
		System.out.println("飞机用发动机飞行！");
	}

}