package com.twilightDF.demos;
/**
 * ����ѭ���е�break��continue
 * @author �ŷ�
 *
 */
public class TextBreakAndContinue {
	public static void main(String[] args) {
	/*
	 * ����break
	 * 
	 */
		int total = 0;
		int a ;
		while(true) {
		a = (int)(Math.random()*100);
		
		System.out.print(a + "��");
		
		total ++;
		if(total%5 == 0)
			System.out.println();
		
		if(a == 88) 
			break;
		
		}
		System.out.println("total uesd " + total + " times");
		System.out.println("####################################");
		/*
		 * ����continue
		 */
		System.out.println("��Щ�����ܱ�3������");
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
		
		
		
		
		
		
		
		
		
		
}
}
