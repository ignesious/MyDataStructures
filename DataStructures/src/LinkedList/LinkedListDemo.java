package LinkedList;



public class LinkedListDemo {
	
ListNode head;

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	
	public void findCount() {
	       ListNode n=head;int listCount=0;
			while (n!= null) {
				//System.out.print(n.val+"------>");
				n=n.next;
				listCount++;
				
			}
System.out.println("Count of the list is---->"+listCount);
		}
	
	
	public void traversalList() {
       ListNode n=head;
		while (n!= null) {
			System.out.print(n.val+"------>");
			n=n.next;
		}

	}
	
	
	public String findelemRecursive(ListNode findElem,int key)
	{
		
	if(findElem == null)
		
	 return "Not Found";	
		
	else if(key == findElem.val)
		return "Found the value "+ key;
		
	else
		return findelemRecursive(findElem.next, key);
		
		
		
		
	}
	
	
	public ListNode returnFindElemRecursive(ListNode findElem,int key)
	{
		
	if(findElem == null)
		
	 return null;	
		
	else if(key == findElem.val)
		return findElem;
		
	else
		return returnFindElemRecursive(findElem.next, key);
		
		
		
		
	}
	
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDemo demo = new LinkedListDemo();
		demo.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);

		// linking part:-

		demo.head.next = second;
		second.next = third;
	// Test Traversal
		demo.traversalList();
		
	//	Test FindCount
		demo.findCount();
		
	// Test find element in the list	
		System.out.println(demo.findelemRecursive(demo.head,1));
		
	// Test find element in the list and return the node 	
		
		int firstKey = 4;
		int nextKey = 2;
		
	ListNode firstKeyfound = demo.returnFindElemRecursive(demo.head, firstKey);
	ListNode nextKeyfound = demo.returnFindElemRecursive(demo.head, nextKey);	
	if(firstKeyfound!=null) System.out.println("Firstkeyfound"+firstKeyfound.val);
	if(nextKeyfound!=null)	System.out.println("NextKeyFound" +nextKeyfound.val);

		
	}

}
