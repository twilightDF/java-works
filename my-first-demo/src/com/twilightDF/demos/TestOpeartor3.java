package com.twilightDF.demos;
/**
 * ����λ�����
 * @author �ŷ�
 *�� & �� | �� ^ , ~ , << , >> ��
 * �����������ͱ������ж�����λ��λ֮����߼�������
 */
public class TestOpeartor3 {

	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		System .out.println(3 & 4);
		System .out.println(3 | 4);
		System .out.println(3 ^ 4);
		System .out.println(~3);
		
		System.out .println(3 << 2);//�߼����ƣ��൱��3*2*2��������һλ���൱�ڳ�һ������
		System.out .println(12 >> 2);//�߼����ƣ��൱��12/2/2������������������ͬ��
	
		/**
		 * �����ַ��������
		 */
		System.out .println("###############################################");
		String c = "1";
		int d = 4;
		int e = 5;
		char f = 'a';
		 System.out.println(c + d);//��Բ�������String����ʱ "+" ������Ϊ����
		 						   //�����������Ϊ�����ַ��������ӷ���"1" +4=14
		 System.out.println(d + e);//"+"��Ϊ���������.4+5=9
		 System.out.println(d + e + c);//4+5 + "1"=91
		 System.out.println(c + d +e);//*  "1" + 4 ="14" + 5=145
		 System.out.println(d + f);//4+'a'= 4+97 =101
		 
		 /**
		  * ���������
		  * ����ʽ��a:b
		  * ����Ϊ���� ����ʽ ��Ϊ�棬����� ������ǰ�� a �����Ǽ٣������ b ��
		  */
			System.out .println("############################################");	
		int score = 80;
		int x = 87;
		String type = score>60 ? "����":"������";
		
		System.out.println(type);
		
		System.out .println(x>90?"��":(x>60?"��":"��"));
		
		
		
		
	}
}
