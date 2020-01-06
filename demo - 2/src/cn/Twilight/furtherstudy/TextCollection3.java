package cn.Twilight.furtherstudy;
/**
 * 
 *�Լ�ʵ��һ��LinkedList
 */
public class TextCollection3 {
 
	private Node1 first;
	private Node1 last;
	
	private int size;
	
	
	public int size() {
		return size;
	}
	public void add(Object obj) {
		Node1 n = new Node1();
		if(first == null) {
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			
			first = n;
			last = n;
			
		}else {
			//��last���������µĽڵ�
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			last.setNext(n);
			
			last = n;
			}
		size ++;
	}
	public static void main(String[] args) {
		TextCollection3 list = new TextCollection3(); 
		list.add("aaa");
		list.add("bbb");
		System.out.print(list.size ());
		
	}
}