package com.twilightDF.demos;
/**
 * 测试位运算符
 * @author 杜锋
 *“ & ， | ， ^ , ~ , << , >> ”
 * 对于数字类型变量进行二进制位于位之间的逻辑操作！
 */
public class TestOpeartor3 {

	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		System .out.println(3 & 4);
		System .out.println(3 | 4);
		System .out.println(3 ^ 4);
		System .out.println(~3);
		
		System.out .println(3 << 2);//逻辑左移，相当于3*2*2操作。移一位则相当于乘一个二。
		System.out .println(12 >> 2);//逻辑右移，相当于12/2/2操作。规则与左移相同。
	
		/**
		 * 测试字符串运算符
		 */
		System.out .println("###############################################");
		String c = "1";
		int d = 4;
		int e = 5;
		char f = 'a';
		 System.out.println(c + d);//面对操作数有String类型时 "+" 不再作为算数
		 						   //运算符，而作为两个字符串的链接符。"1" +4=14
		 System.out.println(d + e);//"+"作为算数运算符.4+5=9
		 System.out.println(d + e + c);//4+5 + "1"=91
		 System.out.println(c + d +e);//*  "1" + 4 ="14" + 5=145
		 System.out.println(d + f);//4+'a'= 4+97 =101
		 
		 /**
		  * 条件运算符
		  * 条件式？a:b
		  * 意义为，若 条件式 是为真，则输出 “：”前的 a ，若是假，则输出 b 。
		  */
			System.out .println("############################################");	
		int score = 80;
		int x = 87;
		String type = score>60 ? "及格":"不及格";
		
		System.out.println(type);
		
		System.out .println(x>90?"优":(x>60?"良":"差"));
		
		
		
		
	}
}
