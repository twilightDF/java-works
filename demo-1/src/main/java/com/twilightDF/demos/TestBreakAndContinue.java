package com.twilightDF.demos;
/**
 * 测试循环中的break和continue
 * @author 杜锋
 *
 */
public class TestBreakAndContinue {
	public static void main(String[] args) {
	/*
	 * 测试break
	 * 
	 */
		int total = 0;
		int a ;
		while(true) {
		a = (int)(Math.random()*100);
		
		System.out.print(a + "、");
		
		total ++;
		if(total%5 == 0)
			System.out.println();
		
		if(a == 88) 
			break;
		
		}
		System.out.println("total uesd " + total + " times");
		System.out.println("####################################");
		/*
		 * 测试continue
		 */
		System.out.println("这些数不能被3整除：");
		int j = 0; 
		for(int i = 100;i <= 150;i++) {
			if(i%3 == 0) {
				continue;
			}
			System.out.print(i + " ");
			j++;
			if(j%5 == 0) {
				System.out.println();
			}
		}
		
			/**
			 * 测试带标签的break和continue
			 */
			 //输出101~200之间的质数
		System.out.println();
		System.out.println("######################");
		System.out.println("质数有： ");
		outer:for(int b = 101;b <= 150;b++) {
			for(int c = 2;c <= b/2;c++) {
				if(b%c == 0) {
					continue outer;
				}
			}
			System.out.print(b + ", ");
		}
		
		
		
		
		
		
		
		
}
}
