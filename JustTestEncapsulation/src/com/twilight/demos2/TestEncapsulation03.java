package com.twilight.demos2;

import com.twilight.demos.TestEncapsulation;
/**
 * ���Է�װ
 * @author �ŷ�
 *
 */
public class TestEncapsulation03 {

	public static void main(String[] args) {

		TestEncapsulation h = new TestEncapsulation();
		//h.height = 182;heightΪdefault���ͣ���ͬ�������ܷ��ʡ�
	}

}

class Id extends TestEncapsulation{


	void a() {
		TestEncapsulation a  = new TestEncapsulation();
		a.id;
	}
	
}