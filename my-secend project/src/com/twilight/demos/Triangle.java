package com.twilight.demos;

public class Triangle {
	 private int row;
	 private char ch;
	 public Triangle(int a,char c) {
		 row = a;
		 ch = c; 
	 }
	 public void show(){
		 for(int i = 0;i < row;i++){
			 for(int j = row-1;j > i;j--){
				 System.out.print(' ');
			 }
			 for(int k = 1;k <= 2*i-1;k++) {
				 System.out.print(ch);
			 }
			 System.out.println();
				 
		 }
	 }
	 
	 

}
