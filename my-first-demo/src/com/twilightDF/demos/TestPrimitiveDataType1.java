package com.twilightDF.demos;
/**
 * ���Ը����ͱ���
 * @author �ŷ�
 *
 */

import java.math.*;
    
//����math���ݰ�����BigDecimal��ȷ���㸡���������ݣ�

public class TextPrimitiveDataType1 {

	public static void main(String[] args) {

		float a = 3.14F;
		/*float�������ȸ����������ͣ�
		*�������F��ʾ����Ϊ�����ȳ�����
		*��Χ��-3.403E38~3.403E38
		*  ��E38����ѧ������ = 10^38
		*
		*/
		double b = 3.14;
		/*
		 * double��˫���ȸ������ͣ�
		 * ��Χ��-1.708E308~1.798E308��
		 * 
		 * 
		 * 
		 * */
		
		//�����������ݲ���ȷ���������ڱȽϣ�
		float d = 0.1F;
		double f = 1.0/10;
		
		System.out.println(d == f);
		
		float d1 = 1234512345F;
		float d2 = d1+1;
		if(d1 == d2) {
			System.out.println("d1 == d2");
		}else {
			System.out.println("d1 != d2");
		}
		
		System.out .println("########################");
		
		BigDecimal bd = BigDecimal.valueOf(1.0);
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		System.out.println(bd);//0.5
		System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);//0.500000000000000000001!
		//BigDecimal ʵ���˸����������ݵľ�ȷ���㣡
	}
	
}
