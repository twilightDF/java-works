package com.twilight.demo2;

import com.twilight.demo2.Face.Nose;

/**
 * �����ڲ���
 * @author �ŷ�
 *�ڲ��ࣺΪ�����ڷ�װ����һ���ཨ��զ��һ������ڲ��������ڲ���
 *
 *���壺
 *�����ⲿ��ֱ�ӷ��ʣ�������ͬһ���е�������ֱ�ӷ���
 *�ڲ������ֱ�ӷ����ⲿ���˽�����ԣ����ⲿ�಻�ܷ����ڲ��������
 *
 *�ڲ��������֣�
 *1����Ա�ڲ���
 *		i���Ǿ�̬�ڲ���
 *			
 *		ii����̬�ڲ���
 *2�������ڲ���
 *		�����̼�����
 *3,	 �ֲ��ڲ��ࣨ�ڷ����ﶨ����ࣩ
 *
 *�ܽ᣺
 *��ͨ�ĳ�Ա�ڲ�����Է����ⲿ�����ͨ�����Ժͷ��������Կ����ⲿ���һ����ͨ�����ԣ�
 *��̬���ڲ��಻��ֱ�ӷ����ⲿ�����ͨ�����Ժͷ����������Է����ⲿ��ľ�̬���ԣ�
 */
public class InnerClasses {
	public static void main(String[] args) {
		/*����ͨ���ⲿ�� �Ķ�����á��͵��ڲ�����һ����Ա�����ͺ��ˣ�*/
		Face f  = new Face();
		Nose n = f.new Nose();
		n.breath();
		//��һ�ִ�������ķ�����
		Face.Ear e = new Face.Ear();
		e.listen();
	}
}

class Face{
	
	String type = "����";
	String color = "���";
	static String shape = "Բ";
	
	//�Ǿ�̬�ڲ���
	class Nose{
		String type = "ӥ����";
		void breath() {
			System.out.println(color);
			//��������������µ���
			System.out.println(Face.this.type);
			System.out.println("������");
		}
	}
	
	//��̬�ڲ���
	static class Ear{
		void listen() {
			System.out.println("��������");
			
			//��Ϊ��̬��Ա�������࣬���Բ���ֱ�ӵ����ⲿ�����ͨ���Ժ���ͨ������
			//System.out.println(color);
			//�����Ե��þ�̬�����Ժͷ�����
			System.out.println(shape);
		}
		String type = "ˮ����";
	}
}
