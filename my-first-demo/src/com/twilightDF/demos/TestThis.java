package com.twilightDF.demos;
/**
 * ����this�ؼ��ֵ��÷��ͱ���
 * @author �ŷ�
 *
 */
public class TextThis {
	
	int a;
	int b;
	int c;
	

	public TextThis(int a,int b) {
		//�÷�һ���������ֳ�Ա�����;ֲ�������
		this.a = a;
		this.b = b;
	}
	
	public TextThis(int a,int b,int c) {
		
		this(a,b);//�÷��������ù���������ֻ��Ϊ��һ�䣡
		this.c = c;
	}

	//���ʣ���ǰ�����õĶ���ĵ�ַ�� 
}
