package com.twilightDF.demos;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

/**
 * 测试递归功能
 * @author 杜锋
 *
 */
public class TestRecursion {

	public static void main(String[] arg) {
		//该功能实现10的递乘！
		TestRecursion fa = new TestRecursion();
		System.out.println("用递归算的10！ ：" + fa.factoriaR(10));
		
		System.out.println("用循环算的10！ ：" + fa.fatcoriaL(10));

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
	

