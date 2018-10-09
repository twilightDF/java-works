package com.twilight.demo2;

import com.twilight.demo2.Face.Nose;

/**
 * 测试内部类
 * @author 杜锋
 *内部类：为例便于封装，建一个类建立咋另一个类的内部，叫做内部类
 *
 *意义：
 *能让外部类直接访问，不允许同一包中的其他类直接访问
 *内部类可以直接访问外部类的私有属性，但外部类不能访问内部类的属性
 *
 *内部类有两种：
 *1，成员内部类
 *		i，非静态内部类
 *			
 *		ii，静态内部类
 *2，匿名内部类
 *		（键盘监听）
 *3,	 局部内部类（在方法里定义的类）
 *
 *总结：
 *普通的成员内部类可以访问外部类的普通的属性和方法，可以看作外部类的一个普通的属性！
 *静态的内部类不能直接访问外部类的普通的属性和方法，但可以访问外部类的静态属性！
 */
public class InnerClasses {
	public static void main(String[] args) {
		/*必须通过外部类 的对象调用。就当内部类是一个成员变量就好了！*/
		Face f  = new Face();
		Nose n = f.new Nose();
		n.breath();
		//另一种创建对象的方法！
		Face.Ear e = new Face.Ear();
		e.listen();
	}
}

class Face{
	
	String type = "红润";
	String color = "白皙";
	static String shape = "圆";
	
	//非静态内部类
	class Nose{
		String type = "鹰钩鼻";
		void breath() {
			System.out.println(color);
			//如果重名就用以下调用
			System.out.println(Face.this.type);
			System.out.println("呼吸！");
		}
	}
	
	//静态内部类
	static class Ear{
		void listen() {
			System.out.println("我在听！");
			
			//因为静态成员从属于类，所以不能直接调用外部类的普通属性和普通方法！
			//System.out.println(color);
			//但可以调用静态的属性和方法！
			System.out.println(shape);
		}
		String type = "水灵灵";
	}
}
