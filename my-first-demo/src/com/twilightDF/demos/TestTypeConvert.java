package com.twilightDF.demos;
/**
 * 测试自动类型转换
 * @author DELL
 *原则，范围小的可以自动转换为范围大的！
 *整数类型自动转换为浮点数类型！
 */
public class TestTypeConvert {

	public static void main(String[] args) {

		short a1 = 123;
		int b1 = a1;
		
		int a = 123456;
		//short b = a;报错。
		
		long c = 123456;
		float c1 = c;//flaot 的表示范围比long类型的大。可以转换！
		
		
		int d = 123456;
		double d1 = d;
		
		float e = 123455L;
		 
		//特例
		byte f = 123;
		//byte可以表示int类型的123，是因为123在byte的表数范围内！
		
		/**
		 * 测试强制类型转换
		 */
		
		double g = 3.14;
		int g1 = (int)g;
		
		char h = 'a';
		int h1 = h + 1;
		System.out.println(g1);
		System.out.println(h1);
		System.out.println((char)h1);
		
		/**
		 * 
		 *基本类型转换常见的错误！
		 *
		 */
		
		//操作数太大，是否溢出？
		
		int i = 2000000000;
		
		int j = i * 2;
		System.out.println(j);//输出-294967296 错误！原因：i *i1 结果已经超过int表数范围！
		
		long j2 = 2 * i;
		System.out.println(j2);//输出-294967296 错误！将错误的“结果”赋值给long类型不能改变问题
		
		//解决方法 ：将第一个操作数转换为long类型，再赋值给long类型的变量
		long j1 = 2L * i;
		
		System.out.println(j1);
		
		//变量名L尽量不要用小写l ，long类型用大写不要用小写！
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
