package com.twilightDF.demos;
/**
 * �����Ļ�������
 * @author �ŷ�
 *
 */
public class TestMethod {

	public static void main(String[] args) {
		TestMethod methodUse = new TestMethod();//newһ�����󣬷�������ֱ�ӵ��ã�����ͨ���������!
		methodUse.print();
		System.out.println("#########################################");
		int c = 100 + methodUse.add(12, 13, 14);//ʵ�Σ����÷���ʱ����Ĳ�����
												//���ó�����add������ֱ����Ϊһ��int���͵����������㣡
		System.out.println(methodUse.add(12, 13, 14));
		System.out.println(c);
		
	} 
	/**
	 * ���������ķ���
	 */
	void/*void��ʾ�޷���ֵ��*/ print() {
		System.out.println("��仰�ǵ��õ�print������");
	}
	/**
	 * �Ų����ķ���
	 */
	int/*����ֵΪint����*/ add(int a,int b,int c)/*�βΣ��ڱ�д����ʱʹ��*/ {
		int sum = a + b + c;
		return sum;//return���������á�1.�������������С�2.����ֵ��
	}
		
}
