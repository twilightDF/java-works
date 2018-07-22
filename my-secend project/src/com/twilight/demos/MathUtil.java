package com.twilight.demos;

public class MathUtil {
	private int total = 0;
	public int accumulate(int c){
		total += c;
		return total;
	}
	public int getTotal(){
		return total;
	}
	public int add(int a, int b) {
		return a + b;
	}
	public int max(int[] d) {
		int tempMax = 0;
		
		for(int i=0; i< d.length;i++) {
			if(d[i]>tempMax) {
				tempMax = d[i];
			}
			
		}
		return tempMax;
	}
	
	public double avg(int[] a) {
		int sum = 0;
		for(int i = 0;i<a.length;i++) {
			sum += a[i];
		}
		return (double)sum/a.length ;
	}
}
