package com.twilight.demo2;
/**
 * 测试Object类里面的一些方法
 * @author 杜锋
 *
 */
public class TestObject {

	public static void main(String[] args) {
		//测试toString()方法。
		//在直接打印对象时，实际上实在调用Object里的toString方法！
		//toString() 方法：打印包，类信息以及对象的地址
		TestObject n1 = new TestObject();
		System.out.println(n1/*实际上是n1.toString*/);//没重写之前的输出：java.lang.Object@6d06d69c
		
		Person2 p2 = new Person2("杜锋",21);
		System.out.println(p2);
		
		System.out.println("##########################################");
		//测试 “==”和equal(Object obj)方法
		//使用“==”时，判断“==”两边的对象是否相同
		//使用equal(Object obj)方法时，实际上是调用 “==”，所以我们可以重写equal(Object obj)
		Object obj;//对于Object类建立一个对象
		
		User u1 = new User("杜锋",1001,21);
		User u2 = new User("封文豪",1001,19);
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
		String str;//对于String类建立一个对象
		//String类里实际上也重写了equal方法，比较字符是否相同，具体可以去看原码
		String str1 = new String();
		String str2 = new String();
		System.out.println(str1 == str2);//不是同一个对象，false
		System.out.println(str1.equals(str2));//字符相同，都没有，true
		}
	
}

class Person2{

	String name;
	int age;
	public Person2(String name,int age) {
		this.name = name;
		this.age = age;
	}
	@Override//标识符，表示以下内容为重写内容
	public String toString() {
		 return name + "年龄：" + age;
	 }
}

class User{
	String name;
	int id;
	int age;
	//alt + shift + s或者，右键 —— source —— Generate Constructor Using Fields可自动创建含参的构造方法！
	public User(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	//以下程序为只以id来判断两个对象是否相同
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;//如何使同一个对象，输出true
		if (obj == null)
			return false;//如果输了对象为空，输出false
		if (getClass() != obj.getClass())
			return false;//如果两个对象不属于同一个类，输出false
		User other = (User) obj;
		if (id != other.id)//如果Id不相同，输出false
			return false;
		return true;//以上条件都没有输出值，则输出true
	}
	
}





