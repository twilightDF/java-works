package com.twilightDF.demos;
/**
 * �����߼������
 * @author �ŷ�
 *"  & , && , | , || , ! , ^  "
 */
public class TestOpreator2 {

	public static void main(String[] args) {

		
		boolean b1 = true; 
		boolean b2 = false;
		
		System.out.println(b1 & b2);//�룺һ��Ϊ��
		System.out.println(b1 | b2);//��һ��Ϊ��
		System.out.println(!b1);//�ǣ�ȡ��
		System.out.println(b1 ^ b2);//��򣺲�ͬΪ��
		
		//&&����·�� �� ||��·��
		//�ж϶�·����֮ǰ��ֵΪ�滹�Ǽ٣��� ��·�� ǰ��ֵΪ�٣���֮���ֵ�����ٲ�
		//����·��֮ǰ��ֵΪ�棬��֮���ֵ�����ٲ⡣
		//ʵ���ж��ö�·��Ͷ�·�򣬽�ʡ����ʱ�䡣
		
		//int a = 3/0; 0��������ĸ��
		
		boolean d = 1>2 && 2>(3/0);
		System.out .println(d);//��������Ϊ��·��ϵͳû������ 3/0��
		//boolean d1 = 1>2 & 2>a;
		//System.out .println(d1);������Ϊû�ж�·ԭ��ϵͳ������ a ������
	}

}
