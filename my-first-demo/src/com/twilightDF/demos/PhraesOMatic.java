package com.twilightDF.demos;

public class PhraesOMatic {
	public static void main(String[] arg) {
		String[] oneRandomNumberGroup = {
			"�ŷ�","���ĺ�","������"	
		};
		String[] secondRandomNumberGroup = {
			"����","Ŭ��","�ܰ�"
		};
		int oneLength = oneRandomNumberGroup.length;
		int sceondLength = secondRandomNumberGroup.length;
		System.out.println(oneLength);
		System.out.println(sceondLength);
		System.out.println(oneRandomNumberGroup [0]);
		System.out.println(oneRandomNumberGroup [1]);
		System.out.println(oneRandomNumberGroup [2]);
		System.out.println(secondRandomNumberGroup [0]);
		System.out.println(secondRandomNumberGroup [1]);
		System.out.println(secondRandomNumberGroup [2]);
		
		int random1 = (int) (Math.random() * oneLength);
		int random2 = (int) (Math.random() * sceondLength);
		 
 		System.out.println(random1);
 		System.out.println(random2);
 		
 		System.out.println(oneRandomNumberGroup [random1] + secondRandomNumberGroup [random2]);
		
 		//i'm so good.
		
		int x = (int) 24.6;
		System.out.println("x = " + x);//ȡ���������������롣
	}
}
