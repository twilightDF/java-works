package com.twilightDF.demos;
/**
 * �����ַ��ͱ���
 * @author �ŷ�
 *
 */
public class TextPrimitiveDataType2 {

	public static void main(String[] args) {

		char a = 'a';//ռ�����ֽڣ�
		char b = '��';//�ɴ�ӡ���ӣ�
		char c = '\u0061';//�ɴ�ӡuniqcode���룡
		
		System.out.println(c);
		
		//ת���ַ�
		
		System.out.println("" + 'a' + 'b');//�����Ӻŵ����ŵ��ַ��ͱ�����Ϊ
		                                   //�����ͱ�����Ҫ��ǰ�ӿ��ַ���
		System.out.println("" + 'a' + '\b' + 'b');//�˸�
		System.out.println("" + 'a' + '\n' + 'b');//����
		System.out.println("" + 'a' + '\r' + 'b');//�س�
		System.out.println("" + 'a' + '\t' + 'b');//�Ʊ�
		System.out.println("" + 'a' + '\'' + 'b');
		System.out.println("" + 'a' + '\"' + 'b');
		System.out.println("" + 'a' + '\\' + 'b');
		
	}

}
