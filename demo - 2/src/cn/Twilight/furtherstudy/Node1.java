package cn.Twilight.furtherstudy;
/**
 * 节点类
 */
public class Node1 {

	private Node1 previous;// Attention！！！ previous表示上一个节点，应该使用节点类型

	private Object obj;
	
	private Node1 next;//下一个节点，同理，使用节点类型
	
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
