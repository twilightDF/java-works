package com.twilight.demos;
/*
 * 哈哈哈哈哈
 */
public class HelloWorld {

	public static void main(String[] args) {
		MathUtil math = new MathUtil();
		System.out.println(math.add(2,3));
		
		//1到100的累加。
		for(int i = 0;i <= 100;i++) {
			math.accumulate(i);
		}
		System.out.println("total" + math.getTotal());
		
		int[] d = {11,34,56,67,32,12,65,77};
		System.out.println("max is "+math.max(d));
		
		System.out.println("avg is "+math.avg(d));
		
		
		

	}

}
