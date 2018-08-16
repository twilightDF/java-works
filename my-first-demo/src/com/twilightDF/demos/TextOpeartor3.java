package com.twilightDF.demos;
/**
 * 测试为运算符
 * @author 杜锋
 *“ & ， | ， ^ , ~ , << , >> ”
 * 对于数字类型变量进行二进制位于位之间的逻辑操作！
 */
public class TextOpeartor3 {

	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		System .out.println(3 & 4);
		System .out.println(3 | 4);
		System .out.println(3 ^ 4);
		System .out.println(~3);
		
		System.out .println(3 << 2);//逻辑左移，相当于3*2*2操作。移一位则相当于乘一个二。
		System.out .println(12 >> 2);//逻辑右移，相当于12/2/2操作。规则与左移相同。
	}
}
