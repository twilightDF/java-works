package com.twilightDF.demos;
/**
 * 方法的基本运用
 * @author 杜锋
 *
 */
public class TestMethod {

	public static void main(String[] args) {
		TestMethod methodUse = new TestMethod();//new一个对象，方法不能直接调用，必须通过对象调用!
		methodUse.print();
		System.out.println("#########################################");
		int c = 100 + methodUse.add(12, 13, 14);//实参：运用方法时输入的参数。
												//调用出来的add方法可直接作为一个int类型的数进行运算！
		System.out.println(methodUse.add(12, 13, 14));
		System.out.println(c);
		
	} 
	/**
	 * 不含参数的方法
	 */
	void/*void表示无返回值！*/ print() {
		System.out.println("这句话是调用的print方法！");
	}
	/**
	 * 放参数的方法
	 */
	int/*返回值为int类型*/ add(int a,int b,int c)/*形参：在编写方法时使用*/ {
		int sum = a + b + c;
		return sum;//return有两个作用。1.结束方法的运行。2.返回值。
	}
		
}
