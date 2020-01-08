package cn.Twilight.furtherstudy;
/**
 * 
 *�Լ�ʵ��һ��LinkedList
 */
public class TextCollection3 {
 
	private Node1 first;
	private Node1 last;
	
	private int size = 0;
	public int size() {
		return size;
	}
	
	//��װ������
		private void rangeCheck(int index) {
			if(index >= size) {
				try {
					throw new Exception();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
		
		
	//�������������,����node��ַ
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
		Node1 n = new Node1();//nΪ��ǰ������ڵ�
		if(first == null) {
			n.setPrevious(null);//n��ǰ���ڵ�
			n.setObj(obj);//n��ֵ
			n.setNext(null);//n�ĺ�̽ڵ�
			
			first = n;//�������Ϊͷָ��
			last = n;//��¼���һ���ڵ��ָ��
			
		}else {
			//��last���������µĽڵ�
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			
			last.setNext(n);//��ΪΪ˫�������˲������ǣ����κ�Ľڵ�ĺ����Ϊn
			
			last = n;//��󽫼�¼���ڵ��ָ��ָ��n
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
		temp.getPrevious().setNext(temp.getNext());//��temp��ǰ���ڵ�ĺ��ָ��ָ��temp�ĺ�̽ڵ�
		temp.getNext().setPrevious(temp.getPrevious());//��temp�ĺ�̽ڵ��ǰ��ָ��ָ��temp��ǰ���ڵ�
		
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
		System.out.println("remove����ʾ��" + list.getNode(1).getObj());	
		System.out.println("************************");
		list.add(1, "abc");
		System.out.println(list.getNode(1).getObj());
		System.out.println("************************");

}
	}