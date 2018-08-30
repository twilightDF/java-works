package com.twilight.demo2;
/**
 * 测试super（）父类方法的引用
 * @author 杜锋
 *
 */
public class TestSuper {

	public static void main(String[] args){
		new Child().f();//建立对象并调用f()方法
		new Child();//测试了继承树追溯。
		
	}
	
	
	
}

class Father{
	int value;
	public void f(){
		value = 100;
		System.out.println("调用父类value= :" + value);
	}
	public Father() {
		//在构造方法中的第一句总是super();
		System.out.println("调用了父类");
	}
	
}

class Child extends Father{
	int value;
	public void f(){
		super.f();//调用父类普通方法。
		value = 200;
		System.out.println("调用子类value= :" + value);
	}
	public Child() {
		//构造方法重担第一句总是super();
		System.out.println("调用了子类");
	}
}