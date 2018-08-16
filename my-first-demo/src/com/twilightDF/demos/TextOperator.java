package com.twilightDF.demos;
/**
 * 测试算是运算符
 * @author 杜锋
 *
 */
public class TextOperator {

	public static void main(String[] args) {
/**
 * 二元运算符
 */
		byte a = 1;
		short a1 = 1;
		byte b = 2;
		long b1 = 2;
		//byte c = a + b;//报错，a+b为int（只要无long型，其他类型相加都为int型！）型，不能赋值给byte！
		//int c1 = b + b1;//报错，b+b1为long型，不能赋值给int型！
		
		float d = 3.14F;//默认常量为double类型，若赋值给float，在后加F！
		double e = 3.14;
		//flaot f = d + e;报错，d+e为double类型（有double类计算时，结果也为double类！），不能赋值给float！
		
		System.out.println(9%5);//4
		System.out.println(-9%5);//-4
		System.out.println(9%-5);//4  *取模运算结果与左边数字符号相同！
		
		/**
		 * 一元运算符
		 * 
		 */
		
		int g = 3;
		int h = g++;//先赋值给h，再自加！
		System.out.println("g=" + g + "\nh=" + h);
		 g = 3;
		 h = ++g;//先自加，再赋值给i！
		System.out.println("g=" + g + "\nh=" + h);
		
	}
}