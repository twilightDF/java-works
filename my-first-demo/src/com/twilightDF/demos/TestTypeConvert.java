package com.twilightDF.demos;
/**
 * �����Զ�����ת��
 * @author DELL
 *ԭ�򣬷�ΧС�Ŀ����Զ�ת��Ϊ��Χ��ģ�
 *���������Զ�ת��Ϊ���������ͣ�
 */
public class TestTypeConvert {

	public static void main(String[] args) {

		short a1 = 123;
		int b1 = a1;
		
		int a = 123456;
		//short b = a;����
		
		long c = 123456;
		float c1 = c;//flaot �ı�ʾ��Χ��long���͵Ĵ󡣿���ת����
		
		
		int d = 123456;
		double d1 = d;
		
		float e = 123455L;
		 
		//����
		byte f = 123;
		//byte���Ա�ʾint���͵�123������Ϊ123��byte�ı�����Χ�ڣ�
		
		/**
		 * ����ǿ������ת��
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
		 *��������ת�������Ĵ���
		 *
		 */
		
		//������̫���Ƿ������
		
		int i = 2000000000;
		
		int j = i * 2;
		System.out.println(j);//���-294967296 ����ԭ��i *i1 ����Ѿ�����int������Χ��
		
		long j2 = 2 * i;
		System.out.println(j2);//���-294967296 ���󣡽�����ġ��������ֵ��long���Ͳ��ܸı�����
		
		//������� ������һ��������ת��Ϊlong���ͣ��ٸ�ֵ��long���͵ı���
		long j1 = 2L * i;
		
		System.out.println(j1);
		
		//������L������Ҫ��Сдl ��long�����ô�д��Ҫ��Сд��
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
