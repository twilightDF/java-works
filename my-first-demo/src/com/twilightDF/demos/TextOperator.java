package com.twilightDF.demos;
/**
 * �������������
 * @author �ŷ�
 *
 */
public class TextOperator {

	public static void main(String[] args) {
/**
 * ��Ԫ�����
 */
		byte a = 1;
		short a1 = 1;
		byte b = 2;
		long b1 = 2;
		//byte c = a + b;//����a+bΪint��ֻҪ��long�ͣ�����������Ӷ�Ϊint�ͣ����ͣ����ܸ�ֵ��byte��
		//int c1 = b + b1;//����b+b1Ϊlong�ͣ����ܸ�ֵ��int�ͣ�
		
		float d = 3.14F;//Ĭ�ϳ���Ϊdouble���ͣ�����ֵ��float���ں��F��
		double e = 3.14;
		//flaot f = d + e;����d+eΪdouble���ͣ���double�����ʱ�����ҲΪdouble�࣡�������ܸ�ֵ��float��
		
		System.out.println(9%5);//4
		System.out.println(-9%5);//-4
		System.out.println(9%-5);//4  *ȡģ��������������ַ�����ͬ��
		
		/**
		 * һԪ�����
		 * 
		 */
		
		int g = 3;
		int h = g++;//�ȸ�ֵ��h�����Լӣ�
		System.out.println("g=" + g + "\nh=" + h);
		 g = 3;
		 h = ++g;//���Լӣ��ٸ�ֵ��i��
		System.out.println("g=" + g + "\nh=" + h);
		
	}
}