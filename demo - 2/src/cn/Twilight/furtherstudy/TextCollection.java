package cn.Twilight.furtherstudy;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * �����������Լ����������
 * @author �ŷ�
 * �����������������Ĺ���
 * 1.���������������
 * ��������װ�κ����͵Ķ��󣬶�����������
 * �������Բ��������������ƣ���������Ҫ
 * 2.�����������ӽӿڣ�Ҳ�������ռ�����
 * list��������ظ���
 * set�����򲻿��ظ���
 * 3.Map��ͨ��һ�������ҵ���һ�������йصĶ���
 *
 */
public class TextCollection {

	public static void main(String[] args) {
		 TextCollection c = new TextCollection();
		 
		List list = new ArrayList();
		//List list2 = new LinkedList();
		//ArrayList:�ײ�ʵ�������飬���ҷ��㣬������Ƴ������㣬�̲߳���ȫ��Ч�ʸ�
		//LinkedList:�ײ�ʵ�����������Ҳ����㣬��������Ƴ����㣬�̲߳���ȫ��Ч�ʸ�	
		//Vector:�̰߳�ȫ��Ч�ʵͣ��ײ�ʵ��Ҳ������
		
		
		
		list.add("aaa");
		list.add(new Date());
		list.add(12345);//��װ�ཫ�����Զ���װΪһ������
		list.add(c);
		list.add(new Dog());
		
		
		/*
		 * ����Ϊ����ArrayList���е�һЩ��������
		 * 
		 */
		
		System.out.println(list.size());//����������ȣ�
		
		System.out.println(list.isEmpty());//�ж������Ƿ�Ϊ��
		
		list.remove(c);//�Ƴ������е�ĳһ������
		
		System.out.println(list.size());
		
		list.remove(new Dog());//??????Ϊʲôû���Ƴ�????????
		
		System.out.println(list.size());
		
		System.out.println("******************************");
		List list2 = new ArrayList();
		
		list2.add("bbb");
		list2.add("ccc");
		
		list.add(list2);
		
		System.out.println(list.size());//���Ϊ5������6?????
		
		System.out.println(list.get(0));
		list.set(0,"dadada");//ָ��λ�ò���һ������
	}
}

class Dog {
}