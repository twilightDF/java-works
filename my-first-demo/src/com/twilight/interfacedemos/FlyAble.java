package com.twilight.interfacedemos;

/**
 * ���ٽӿ�
 * @author �ŷ�
 * ʲô�ǽӿڣ�
 * �ӿھ��Ǳȳ�������ӳ���ġ������ࡱ
 * �����໹���Զ��巽���壬���ڽӿ���Ͳ����ˣ��������������һ����
 * Ҳ���ܱ���������
 * �ӿ���ֻ�г����ͳ��󷽷���
 * ���壺
 * Ҳ��ʵ���������ʵ�ֵķ��룬�淶��֮ʵ����ĸ������ԣ�
 *
 */
//����һ���ӿ�
public interface FlyAble {

	//���峣��
	/*public static final   д�벻д����Զ�����*/int MIN_HEIGHT = 1;
	
	/*public abstract    д�벻д����Զ�����*/void fly();
	/*û�з����壡*/
	
}

 interface AttackAble{
	
	void  attack();
}
 
 /**�ӿ�֧�ֶ�̳У�*/
 interface A{
	 void 	 a();
 }
 
 interface B{
	 void b();
	 
 }
 
 //�ӿ�C�̳���A��B�����ӿڣ�ӵ��A��B�����ӿڵĳ��󷽷��ͳ���!
 //��Ȼ�����Լ��ĳ��󷽷��ͳ�����
 interface C extends A,B{
	 void c();
 }
 
 
 //�����ʱһ����ʵ����C�ӿڣ���ô��Ҳһ��Ҫʵ��A,B�ӿ�
 
 class Test implements C{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}
	 
 }
 
 
 
 
 
 
 
 
