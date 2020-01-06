package com.twilight.arraydemos;
/**
 * 测试数组的遍历
 * @author 杜锋
 * 遍历：方便数组元素的读取，但不能修改数据
 */
public class Test02 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		//不用遍历读取数组
		System.out.println("没有使用foreach循环取数");
		for(int i = 0;i <= arr.length - 1;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("#############################");
		//使用遍历 foreach循环
		System.out.println("使用了foreach循环输出");
		for(int m :arr) {
			System.out.print(m + " ");
		}
	}
}
