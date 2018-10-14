package com.twilightDF.demos;
import java.util.Scanner;
/**
 * 测试用scanner获取键盘输入
 * @author DELL
 *
 */
public class TestScanner {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入你的名字：");	
		String name = scanner.nextLine();
		System.out.println("请输入你的年龄：");
		int age = scanner.nextInt();
		System.out .println("***************************");
		
		System.out.println(name);
		System.out.println("已经来到地球的天数：" + age * 365);
		System.out.println("在地球剩余的天数：" + (72-age) * 365);
		
		System.out .println("珍惜时间，努力学习！");
	}
	
}
