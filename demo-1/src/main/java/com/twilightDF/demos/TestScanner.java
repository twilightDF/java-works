package com.twilightDF.demos;
import java.util.Scanner;
/**
 * ������scanner��ȡ��������
 * @author DELL
 *
 */
public class TestScanner {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������������֣�");	
		String name = scanner.nextLine();
		System.out.println("������������䣺");
		int age = scanner.nextInt();
		System.out .println("***************************");
		
		System.out.println(name);
		System.out.println("�Ѿ����������������" + age * 365);
		System.out.println("�ڵ���ʣ���������" + (72-age) * 365);
		
		System.out .println("��ϧʱ�䣬Ŭ��ѧϰ��");
	}
	
}
