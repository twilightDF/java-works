package com.twilight.demos2;

import com.twilight.demos.TestEncapsulation;
/**
 * 测试封装
 * @author 杜锋
 *
 */
public class TestEncapsulation03 {

	public static void main(String[] args) {
		Id h = new Id();
		
		h.a();
		//h.height = 182;height为default类型，不同包，不能访问。
	}

}

class Id extends TestEncapsulation {


	public void a() {
		
		System.out.println(super.id);
	}
	
}