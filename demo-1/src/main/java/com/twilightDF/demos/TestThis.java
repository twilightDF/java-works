package com.twilightDF.demos;
/**
 * 测试this关键字的用法和本质
 * @author 杜锋
 *
 */
public class TestThis {
	
	int a;
	int b;
	int c;
	

	public TestThis(int a,int b) {
		//用法一：用于区分成员变量和局部变量！
		this.a = a;
		this.b = b;
	}
	
	public TestThis(int a,int b,int c) {
		
		this(a,b);//用法二：调用构造器，且只能为第一句！
		this.c = c;
	}

	//本质：当前创建好的对象的地址！ 
}
