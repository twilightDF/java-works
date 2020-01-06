package cn.Twilight.furtherstudy;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * 测试容器类以及其基本概念
 * @author 杜锋
 * 容器：用来储存对象的工具
 * 1.容器和数组的区别：
 * 容器可以装任何类型的对象，而数组有限制
 * 容器可以不用设置容量限制，而数组需要
 * 2.容器的两个子接口（也是用来收集对象）
 * list（有序可重复）
 * set（无序不可重复）
 * 3.Map（通过一个对象找到另一个与其有关的对象）
 *
 */
public class TextCollection {

	public static void main(String[] args) {
		 TextCollection c = new TextCollection();
		 
		List list = new ArrayList();
		//List list2 = new LinkedList();
		//ArrayList:底层实现是数组，查找方便，插入和移除不方便，线程不安全，效率高
		//LinkedList:底层实现是链表，查找不方便，但插入和移除方便，线程不安全，效率高	
		//Vector:线程安全，效率低，底层实现也是数组
		
		
		
		list.add("aaa");
		list.add(new Date());
		list.add(12345);//封装类将数字自动封装为一个对象！
		list.add(c);
		list.add(new Dog());
		
		
		/*
		 * 以下为测试ArrayList类中的一些常见方法
		 * 
		 */
		
		System.out.println(list.size());//获得容器长度；
		
		System.out.println(list.isEmpty());//判断容器是否为空
		
		list.remove(c);//移除容器中的某一个对象
		
		System.out.println(list.size());
		
		list.remove(new Dog());//??????为什么没有移除????????
		
		System.out.println(list.size());
		
		System.out.println("******************************");
		List list2 = new ArrayList();
		
		list2.add("bbb");
		list2.add("ccc");
		
		list.add(list2);
		
		System.out.println(list.size());//结果为5而不是6?????
		
		System.out.println(list.get(0));
		list.set(0,"dadada");//指定位置插入一个对象
	}
}

class Dog {
}