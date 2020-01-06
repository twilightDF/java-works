package com.twilightDF.demos;
/**
 * 测试逻辑运算符
 * @author 杜锋
 *"  & , && , | , || , ! , ^  "
 */
public class TestOpreator2 {

	public static void main(String[] args) {

		
		boolean b1 = true; 
		boolean b2 = false;
		
		System.out.println(b1 & b2);//与：一假为假
		System.out.println(b1 | b2);//或：一真为真
		System.out.println(!b1);//非：取反
		System.out.println(b1 ^ b2);//异或：不同为真
		
		//&&：短路与 ， ||短路或
		//判断短路符号之前的值为真还是假，若 短路与 前的值为假，则之后的值不需再测
		//若短路或之前的值为真，则之后的值不需再测。
		//实践中多用短路与和短路或，节省编译时间。
		
		//int a = 3/0; 0不能做分母！
		
		boolean d = 1>2 && 2>(3/0);
		System.out .println(d);//不报错，以为短路，系统没有运算 3/0。
		//boolean d1 = 1>2 & 2>a;
		//System.out .println(d1);报错，因为没有短路原因，系统运算了 a 而报错。
	}

}
