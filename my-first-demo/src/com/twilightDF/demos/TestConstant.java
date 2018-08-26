package com.twilightDF.demos;
/**
 * 测试变量与常量
 * @author 杜锋
 *
 */
public class TextConstant {
	
	static int d = 20;//静态变量，还未涉及。生命周期伴随整个类！
	
	int age ;/*成员变量，生命周期伴随对象的生命周期！
	
	*成员变量会被系统自动赋值,不一定要初始化
	*int和double类型会自动赋值0
	*char类型会自动赋值"\u0000"
	*boolean类型会自动赋值fales！
	*
	*/
	public static void main(String[] args) {
		{
			int height = 170;//局部变量！使用前一定要初始化！
		}
		int a = 1;//其中a也为局部变量，生命周期伴随方法或语句块的生命周期！1为常量
		int b = 1;
		final int B = 1;
		/*
		 * 用final关键字修饰后，变量b变为了常量 ，之后b不能再被赋值！
		 * b被称为符号常量，按照命名规则 符号常量名字所有字母大写
		 * 
		 * 
		 *int B = 20;系统报错！
		 */
		
	}

}
