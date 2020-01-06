package com.twilightDF.demos;
/**
 * 用来测试标识符命名规则
 * @author 杜锋
 *
 */
public class TestIdentifider {
	
	public static void main(String[] agrs) {
		int abc123 = 1;
		//int 123abc = 1;数字不能开头！
		int _123 = 1;//下划线可以开头！
		int $123 = 1;//美元符可以开头！
		int 变量 = 1;//汉子可以用来命名表示符，但一般不建议！
		/**
		 * 
		 * 此外   类名的标识符每个单词首字母大写！
		 * 		方法名和变量名的标识符第一个单词小写，从第二个单词开始首字母大写！
		 * 
		 * 如 eat();
		 *   eatFood();
		 *   
		 * 	
		 */
		
	}

}
