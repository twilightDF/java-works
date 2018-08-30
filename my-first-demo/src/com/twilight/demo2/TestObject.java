package com.twilight.demo2;
/**
 * ����Object�������һЩ����
 * @author �ŷ�
 *
 */
public class TestObject {

	public static void main(String[] args) {
		//����toString()������
		//��ֱ�Ӵ�ӡ����ʱ��ʵ����ʵ�ڵ���Object���toString������
		//toString() ��������ӡ��������Ϣ�Լ�����ĵ�ַ
		TestObject n1 = new TestObject();
		System.out.println(n1/*ʵ������n1.toString*/);//û��д֮ǰ�������java.lang.Object@6d06d69c
		
		Person2 p2 = new Person2("�ŷ�",21);
		System.out.println(p2);
		
		System.out.println("##########################################");
		//���� ��==����equal(Object obj)����
		//ʹ�á�==��ʱ���жϡ�==�����ߵĶ����Ƿ���ͬ
		//ʹ��equal(Object obj)����ʱ��ʵ�����ǵ��� ��==�����������ǿ�����дequal(Object obj)
		Object obj;//����Object�ཨ��һ������
		
		User u1 = new User("�ŷ�",1001,21);
		User u2 = new User("���ĺ�",1001,19);
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
		String str;//����String�ཨ��һ������
		//String����ʵ����Ҳ��д��equal�������Ƚ��ַ��Ƿ���ͬ���������ȥ��ԭ��
		String str1 = new String();
		String str2 = new String();
		System.out.println(str1 == str2);//����ͬһ������false
		System.out.println(str1.equals(str2));//�ַ���ͬ����û�У�true
		}
	
}

class Person2{

	String name;
	int age;
	public Person2(String name,int age) {
		this.name = name;
		this.age = age;
	}
	@Override//��ʶ������ʾ��������Ϊ��д����
	public String toString() {
		 return name + "���䣺" + age;
	 }
}

class User{
	String name;
	int id;
	int age;
	//alt + shift + s���ߣ��Ҽ� ���� source ���� Generate Constructor Using Fields���Զ��������εĹ��췽����
	public User(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	//���³���Ϊֻ��id���ж����������Ƿ���ͬ
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;//���ʹͬһ���������true
		if (obj == null)
			return false;//������˶���Ϊ�գ����false
		if (getClass() != obj.getClass())
			return false;//���������������ͬһ���࣬���false
		User other = (User) obj;
		if (id != other.id)//���Id����ͬ�����false
			return false;
		return true;//����������û�����ֵ�������true
	}
	
}





