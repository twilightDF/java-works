package com.twilightDF.demos;
/**
 * ����Switch���
 * @author �ŷ�
 *
 */
public class TestSwitch {
	
	public static void main(String[] args) {
		char c = 'a';
		char c1 = (char)(c + (Math.random() * 26));
		System.out.print(c1 + ":");
		
		switch(c1) {
		case 'a':
		case 'o':
		case 'i':
		case 'u':
		case 'e':
			System.out.println("Ԫ��");
			break;
		case 'w':
		case 'y':
			System.out.println("��Ԫ��");
			break;
			default:
				System.out.println("����");
		
		}
	}

}
