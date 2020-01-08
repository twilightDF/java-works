package cn.Twilight.furtherstudy;
/**
 * 
 *自己实现一个LinkedList
 */
public class TextCollection3 {
 
	private Node1 first;
	private Node1 last;
	
	private int size = 0;
	public int size() {
		return size;
	}
	
	//封装检测溢出
		private void rangeCheck(int index) {
			if(index >= size) {
				try {
					throw new Exception();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
		
		
	//对链表进行索引,返回node地址
	public Node1 getNode(int index) {
		
		rangeCheck(index);
		Node1 temp = null;
		if(first != null) {
			temp = first;
			for(int i = 0;i < index;i++) {
				temp = temp.getNext();
			}
			return temp;
		}
		else {
			System.out.println("list is empty!");
			return null;
		}
	
	}
	
	
	
	public void add(Object obj) {
		Node1 n = new Node1();//n为当前待插入节点
		if(first == null) {
			n.setPrevious(null);//n的前驱节点
			n.setObj(obj);//n的值
			n.setNext(null);//n的后继节点
			
			first = n;//可以理解为头指针
			last = n;//记录最后一个节点的指针
			
		}else {
			//往last后面增加新的节点
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			
			last.setNext(n);//因为为双向链表，此步意义是，将次后的节点的后继设为n
			
			last = n;//最后将记录最后节点的指针指向n
			}
		size ++;
	}
	
	public void add(int index,Object obj) {
		
		rangeCheck(index);
		
		Node1 n = new Node1();
		
		Node1 temp =  getNode(index);
		if(temp != null) {
			n.setObj(obj);
			temp.getPrevious().setNext(n);
			n.setPrevious(temp.getPrevious());
			n.setNext(temp);
			temp.setPrevious(n);
		}
		size++;
		
	}
	public void remove(int index) {
		
		Node1 temp =  getNode(index);
		
//		if(size == 1) {
//			first = null;
//			last = null;
//			//System.out.println("now list is empty!!add new element to test the procedure");
//		}
//		if(temp == last) {
//			last = last.getPrevious();
//		}
		temp.getPrevious().setNext(temp.getNext());//让temp的前驱节点的后继指针指向temp的后继节点
		temp.getNext().setPrevious(temp.getPrevious());//让temp的后继节点的前驱指针指向temp的前驱节点
		
		size--;
	}
	
	
	public static void main(String[] args) {
		TextCollection3 list = new TextCollection3(); 
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out .println(list.getNode(1).getObj());
	    System.out.println("********************");
	    list.remove(1);
		System.out.println("remove后显示：" + list.getNode(1).getObj());	
		System.out.println("************************");
		list.add(1, "abc");
		System.out.println(list.getNode(1).getObj());
		System.out.println("************************");

}
	}