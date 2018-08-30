package com.twilight.demos;
/**
 * 测试封装
 * @author 杜锋
 *封装的4个关键字
 *private:私有属性，只有自己类才能才能调用。
 *default:没有修饰的属性，只有自己包能调用。
 *protected:表示可以被同一个包的类和其他包的子类调用。
 *public:可以被该项目下的所有类调用。
 */
public class TestEncapsulation {

	int height;//default类型
	public int id;//protected类型
	public static void main(String[] args) {

		Human h = new Human();
		 //h.age;报错，age属性为private类型，其他类不能访问！
		h.name = "杜锋";//name 为default属性。
	}
	public void  study(){
		
	}

}

class Human{
	private int age;//私有属性看，只能本类使用
	String name;//default属性，自己包能调用。
	public Human() {
		age = 20;//自己类可以访问age;
	}
}