package com.twilightDF.demos;
/**
 * 99�˷������
 * @author DELL
 *
 */
public class _99Chengfabiao {
	public static void main(String[] args) {
		for(int i = 1;i <= 9;i++) {
			for(int j = i; j <= 9;j++) {
				System.out.print(i + "*" + j + "=" + i * j +"  ");
			}
			System.out.println();
		} 
		System.out.println("####################################");
		/**
		 * ��һ��˼��������
		 */
		for(int n = 1;n <= 9;n++) {
			for(int m = 1;m <= n;m++) {
				System.out.print(m + "*" + n + "=" + m * n +"  ");
		 }
			System.out.println();
	  }
		
   }

}
