package com.twilightDF.demos;
/**
 * 测试关键字static
 * @author 杜锋
 *原则：静态方法可以调用其他的静态方法和静态属性，但不能调用非静态的方法和属性。
 *		非静态的方法可以调用静态方法（属性）和非静态的方法（属性）。
 */
public class TestStatic {

	int id;
	String name;
	int pwd;
	//非静态属性
	
	static String company = "好运公司！";
	//静态属性

	public  void a() {
		
		login();//非静态方法可以调用静态方法！
		
	}//非静态方法
	
	public static void login() {
		
		System.out.println(company);//静态方法可以调用静态属性！
		//this.id = id;               this不能用在有static修饰的方法中

		//a();                       // 报错！静态方法不能调用非静态方法！
		
		
		System.out.println(company);//静态方法可以调用静态属性！
	} //静态方法
	 
	public static void main(String[] args) {
		TestStatic u1 = new TestStatic();
		
		u1.login();//通过对象u1调用静态方法login（）
		
		u1.a();//通过对象u1调用非静态方法a（）
		TestStatic u2 = new TestStatic();
		u2.a();
		u2.id = 123; 
		//如果想在静态方法中调用非静态方法和属性的话可以通过对象调用！
		
		
	}
}
