package com.twilight.demos;
/**
 * ���Է�װ
 * @author �ŷ�
 *��װ��4���ؼ���
 *private:˽�����ԣ�ֻ���Լ�����ܲ��ܵ��á�
 *default:û�����ε����ԣ�ֻ���Լ����ܵ��á�
 *protected:��ʾ���Ա�ͬһ�����������������������á�
 *public:���Ա�����Ŀ�µ���������á�
 */
public class TestEncapsulation {

	int height;//default����
	public int id;//protected����
	public static void main(String[] args) {

		Human h = new Human();
		 //h.age;����age����Ϊprivate���ͣ������಻�ܷ��ʣ�
		h.name = "�ŷ�";//name Ϊdefault���ԡ�
	}
	public void  study(){
		
	}

}

class Human{
	private int age;//˽�����Կ���ֻ�ܱ���ʹ��
	String name;//default���ԣ��Լ����ܵ��á�
	public Human() {
		age = 20;//�Լ�����Է���age;
	}
}