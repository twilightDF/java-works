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
		
		System.out.println("#############################");
		int g = 3;
		int h = g++;//�ȸ�ֵ��h�����Լӣ�
		System.out.println("g=" + g + "\nh=" + h);
		 g = 3;
		 h = ++g;//���Լӣ��ٸ�ֵ��i��
		System.out.println("g=" + g + "\nh=" + h);
		
		/**
		 * ������չ�����
		 * "+= , -= , *= , /= , %="  
		 * �ԡ� += ��Ϊ����
		 */
		
		System.out.println("#########################");
		int i = 3;
		int j = 4;
		i += j;//i=i+j
		
		a *= b + 3;//a=a*(b+3)
		
		System.out.println("i=" + i + "\nj=" + j);
		System.out.println("a=" + a + "\nb=" + b);
		
		/**
		 * ���Թ�ϵ�����
		 * ��  ==  ,  !=  ,  <  ,  >  ,  <=  ,  >=  ��
		 */
		System.out.println("##############################");
		 int k = 5;
		 System.out.println(k==5);
		 System.out.println(k!=5);
		 System.out.println(k<=3);
		 
		 //char����Ҳ�������ڹ�ϵ��������������ʹ�ý��٣�
		 //��char�ַ�ת���ɶ�Ӧ��unicode�������㣡
		 char l = 'a';
		 char m = 'b';
		 
		 System.out.println(0 + l);//�� l ת���� int �� 
		 System.out.println((int)l);//��һ�ַ����� l ת��Ϊ int �ͣ�
		 
		 System.out.println(l == m);
		 
		 
			
	}	
		
}