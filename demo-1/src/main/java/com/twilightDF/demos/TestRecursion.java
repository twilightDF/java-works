package com.twilightDF.demos;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

/**
 * ���Եݹ鹦��
 * @author �ŷ�
 *
 */
public class TestRecursion {

	public static void main(String[] arg) {
		//�ù���ʵ��10�ĵݳˣ�
		TestRecursion fa = new TestRecursion();
		System.out.println("�õݹ����10�� ��" + fa.factoriaR(10));
		
		System.out.println("��ѭ�����10�� ��" + fa.fatcoriaL(10));

	}
	
	int factoriaR(int n) {

		if(n == 0) {
			return 1;
		}else {
			return n * factoriaR(n - 1);
		}
	}
	int fatcoriaL(int n) {

		int a = 1;
		while (n > 1) {
			a *= n;
			n -= 1;
		}
		return a;
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

