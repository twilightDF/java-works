package cn.Twilight.furtherstudy;
/**
 * �ڵ���
 */
public class Node1 {

	private Node1 previous;// Attention������ previous��ʾ��һ���ڵ㣬Ӧ��ʹ�ýڵ�����

	private Object obj;
	
	private Node1 next;//��һ���ڵ㣬ͬ��ʹ�ýڵ�����
	
	public Node1() {
		
	}
	public Node1(Node1 previous ,Object obj, Node1 next) {
		super();
		this.previous = previous;
		this.obj = obj;
		this.next = next;
		
	}
	public Node1 getPrevious() {
		return previous;
	}
	public void setPrevious(Node1 previous) {
		this.previous = previous;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Node1 getNext() {
		return next;
	}
	public void setNext(Node1 next) {
		this.next = next;
	}
	
}
