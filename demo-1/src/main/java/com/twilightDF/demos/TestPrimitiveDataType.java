package com.twilightDF.demos;

/**
 * 测试整型数据类型
 * @author 杜锋
 *
 */
public class TestPrimitiveDataType {
	public static void main(String[] args) {
		
		byte age = 30;//byte整型类型，范围为 -2^7~2^7 == -128~127
		short salary = 30000;//short整型类型，范围为 -2^15~2^15 == -32768~32769
		int population = 2000000000 ;//int整型类型，范围为 -2^31~2^31 ~= 21 亿
		long globalPopulatin = 7400000000L;
		//long整型类型，范围为 -2^63~2^63，常量后的L表示长整型常量，
		
		int a = 15;
		int b = 015;//此常量前有“0”，表示为8进制常量。
		int c = 0x15;//此常量前有“0x”，表示为16进制常量。
		//int d = 0b1101;//此常量前有“0b”，表示为2进制常量。
		
		System.out.println(b);
		System.out.println(c);
		//System.out.println(d);
	
		
	}

}
