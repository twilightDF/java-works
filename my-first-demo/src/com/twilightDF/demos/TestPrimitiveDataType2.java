package com.twilightDF.demos;
/**
 * 测试字符型变量
 * @author 杜锋
 *
 */
public class TextPrimitiveDataType2 {

	public static void main(String[] args) {

		char a = 'a';//占两个字节！
		char b = '杜';//可打印汉子！
		char c = '\u0061';//可打印uniqcode编码！
		
		System.out.println(c);
		
		//转义字符
		
		System.out.println("" + 'a' + 'b');//遇到加号单引号的字符型变量变为
		                                   //数字型变量需要在前加空字符！
		System.out.println("" + 'a' + '\b' + 'b');//退格
		System.out.println("" + 'a' + '\n' + 'b');//换行
		System.out.println("" + 'a' + '\r' + 'b');//回车
		System.out.println("" + 'a' + '\t' + 'b');//制表
		System.out.println("" + 'a' + '\'' + 'b');
		System.out.println("" + 'a' + '\"' + 'b');
		System.out.println("" + 'a' + '\\' + 'b');
		
	}

}
