package com.twilight.demos2;

import com.twilight.demos.TestEncapsulation;
/**
 * ���Է�װ
 * @author �ŷ�
 *
 */
public class TestEncapsulation03 {

	public static void main(String[] args) {
		Id h = new Id();
		
		h.a();
		//h.height = 182;heightΪdefault���ͣ���ͬ�������ܷ��ʡ�
	}

}

class Id extends TestEncapsulation {


	public void a() {
		
		System.out.println(super.id);
	}
	
}