package com.twilight.abstarctClass;
/**
 * ���������
 * @author �ŷ�
 *Ҫ��
 *1��������ֻ�����ڼ̳У�����ͨ��new���������ഴ������
 *2���������Ҫ�и��෽������
 *3���г��󷽷�����ֵֻ���ǳ�����
 *����
 *ͨ��������ʵ���˽�������������ʵ�ַֿ���
 *���Ա������෽���������ԣ�
 */
public abstract class  Animal {


	public abstract void run();
	
	public void Sleep() {
		run();//ͨ����̬ʵ�֣�
	}
	//����������Դ�����ͨ�ķ���!
	int a ;
	//���Դ�������
}



class Cat extends Animal{
	
	public void run() {
	
		System.out.println("è�ܣ�");
	}
}
