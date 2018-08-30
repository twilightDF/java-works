package com.twilight.demos2;

import com.twilight.demos.TestEncapsulation;
/**
 * 测试封装
 * @author 杜锋
 *
 */
public class TestEncapsulation03 {

	public static void main(String[] args) {

		TestEncapsulation h = new TestEncapsulation();
		//h.height = 182;height为default类型，不同包，不能访问。
	}

}

class Id extends TestEncapsulation{


	void a() {
		TestEncapsulation a  = new TestEncapsulation();
		a.id;
	}
	
}