package com.twilight.arraydemos;
/**
 * ��������ı���
 * @author �ŷ�
 * ��������������Ԫ�صĶ�ȡ���������޸�����
 */
public class Test02 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		//���ñ�����ȡ����
		System.out.println("û��ʹ��foreachѭ��ȡ��");
		for(int i = 0;i <= arr.length - 1;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("#############################");
		//ʹ�ñ��� foreachѭ��
		System.out.println("ʹ����foreachѭ�����");
		for(int m :arr) {
			System.out.print(m + " ");
		}
	}
}
