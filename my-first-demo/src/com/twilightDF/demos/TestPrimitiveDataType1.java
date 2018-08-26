package com.twilightDF.demos;
/**
 * 测试浮点型变量
 * @author 杜锋
 *
 */

import java.math.*;
    
//导入math数据包，用BigDecimal精确运算浮点类型数据！

public class TextPrimitiveDataType1 {

	public static void main(String[] args) {

		float a = 3.14F;
		/*float：单精度浮点数据类型！
		*常量后的F表示常量为单精度常量！
		*范围：-3.403E38~3.403E38
		*  ‘E38’科学计数法 = 10^38
		*
		*/
		double b = 3.14;
		/*
		 * double：双精度浮点类型！
		 * 范围：-1.708E308~1.798E308！
		 * 
		 * 
		 * 
		 * */
		
		//浮点类型数据不精确，不能用于比较！
		float d = 0.1F;
		double f = 1.0/10;
		
		System.out.println(d == f);
		
		float d1 = 1234512345F;
		float d2 = d1+1;
		if(d1 == d2) {
			System.out.println("d1 == d2");
		}else {
			System.out.println("d1 != d2");
		}
		
		System.out .println("########################");
		
		BigDecimal bd = BigDecimal.valueOf(1.0);
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		System.out.println(bd);//0.5
		System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);//0.500000000000000000001!
		//BigDecimal 实现了浮点类型数据的精确运算！
	}
	
}
