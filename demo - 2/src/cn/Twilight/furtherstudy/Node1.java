package cn.Twilight.furtherstudy;
/**
 * �ڵ���
 */
public class Node1 {

	private Object previous;

	private Object obj;
	
	private Object next;
	
	public Node1() {
		
	}
	public Node1(Object previous ,Object obj, Object next) {
		super();
		this.previous = previous;
		this.obj = obj;
		this.next = next;
		
	}
	public Object getPrevious() {
		return previous;
	}
	public void setPrevious(Object previous) {
		this.previous = previous;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Object getNext() {
		return next;
	}
	public void setNext(Object next) {
		this.next = next;
	}
	
}
