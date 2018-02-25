package LinkedList;



public class LinkedListDemo {
	
ListNode head;
static LinkedListDemo demo;

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
	
	public ListNode reversUtil(ListNode curr,ListNode prev)
	{
		if(curr.next==null){
			demo.head=curr;
			curr.next=prev;
		    return null;
		}
		else
		{
			ListNode next=curr.next;
			curr.next=prev;
			reversUtil(next,curr);
			
		}
	return null;	
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo = new LinkedListDemo();
		demo.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode forth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		// linking part:-

		demo.head.next = second;
		second.next = third;
		third.next=forth;
		forth.next=fifth;
	// Test Traversal
		demo.traversalList();
		
	//	Test FindCount
		demo.findCount();
		demo.reversUtil(demo.head, null);
		
	// Test find element in the list	
		System.out.println(demo.findelemRecursive(demo.head,1));
		
		System.out.println("After revers in recursion " );
		
		demo.traversalList();
	}

}
