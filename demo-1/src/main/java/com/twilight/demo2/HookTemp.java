package com.twilight.demo2;
/**
 * ���Իص������Ӻ�������
 * @author �ŷ�
 *ʵ����Ҳ�Ƕ�̬��
 *Ҳ��ģ�巽��ģʽ
 */
//�ƶ�ģ��
public class HookTemp {
	public static void drawFrame(FatherClass f/*���Ǵ���һ������Ķ���*/) {
		System.out.println("�����̣߳�");
		System.out.println("����ѭ����");
		System.out.println("�鿴��Ϣջ��");
		
		//�����ڣ�
		
		f.paint();/*hook �ҹ�����*/
		
		System.out.println("�������棬����Ч�ʣ�");
	}
	
	public static void main(String[] args) {
		//������01����Ķ���
		drawFrame(new SonClass01());
		//����������ָ���������
		
		
		/*drawFrame(new SonClass02());*/
		
	}
}
//����һ�����࣡
class FatherClass{
	public void paint() {
		System.out.println("�����Լ���������");
		
	}
}
//����������
class SonClass01 extends FatherClass {
  @Override
public void paint() {
	  //��дpaint������
	  System.out.println("����01�Ĵ��ڣ�");
}
}

class SonClass02 extends FatherClass{
	@Override
	public void paint() {
		System.out.println("����02�Ĵ��ڣ�");
	}
}







