package com.twilightDF.demos;
/**
 * ���Թؼ���static
 * @author �ŷ�
 *ԭ�򣺾�̬�������Ե��������ľ�̬�����;�̬���ԣ������ܵ��÷Ǿ�̬�ķ��������ԡ�
 *		�Ǿ�̬�ķ������Ե��þ�̬���������ԣ��ͷǾ�̬�ķ��������ԣ���
 */
public class TestStatic {

	int id;
	String name;
	int pwd;
	//�Ǿ�̬����
	
	static String company = "���˹�˾��";
	//��̬����

	public  void a() {
		
		login();//�Ǿ�̬�������Ե��þ�̬������
		
	}//�Ǿ�̬����
	
	public static void login() {
		
		System.out.println(company);//��̬�������Ե��þ�̬���ԣ�
		//this.id = id;               this����������static���εķ�����

		//a();                       // ������̬�������ܵ��÷Ǿ�̬������
		
		
		System.out.println(company);//��̬�������Ե��þ�̬���ԣ�
	} //��̬����
	 
	public static void main(String[] args) {
		TestStatic u1 = new TestStatic();
		
		u1.login();//ͨ������u1���þ�̬����login����
		
		u1.a();//ͨ������u1���÷Ǿ�̬����a����
		TestStatic u2 = new TestStatic();
		u2.a();
		u2.id = 123; 
		//������ھ�̬�����е��÷Ǿ�̬���������ԵĻ�����ͨ��������ã�
		
		
	}
}
