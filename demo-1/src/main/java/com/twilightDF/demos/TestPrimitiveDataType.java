package com.twilightDF.demos;

/**
 * ����������������
 * @author �ŷ�
 *
 */
public class TestPrimitiveDataType {
	public static void main(String[] args) {
		
		byte age = 30;//byte�������ͣ���ΧΪ -2^7~2^7 == -128~127
		short salary = 30000;//short�������ͣ���ΧΪ -2^15~2^15 == -32768~32769
		int population = 2000000000 ;//int�������ͣ���ΧΪ -2^31~2^31 ~= 21 ��
		long globalPopulatin = 7400000000L;
		//long�������ͣ���ΧΪ -2^63~2^63���������L��ʾ�����ͳ�����
		
		int a = 15;
		int b = 015;//�˳���ǰ�С�0������ʾΪ8���Ƴ�����
		int c = 0x15;//�˳���ǰ�С�0x������ʾΪ16���Ƴ�����
		//int d = 0b1101;//�˳���ǰ�С�0b������ʾΪ2���Ƴ�����
		
		System.out.println(b);
		System.out.println(c);
		//System.out.println(d);
	
		
	}

}
