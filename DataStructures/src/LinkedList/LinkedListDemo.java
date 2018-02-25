package LinkedList;

public class LinkedListDemo {

	ListNode head;
	ListNode headTwo;
	static LinkedListDemo demo;

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public void findCount(ListNode n) {
		//ListNode n = head;
		int listCount = 0;
		while (n != null) {
			// System.out.print(n.val+"------>");
			n = n.next;
			listCount++;

		}
		System.out.println("Count of the list is---->" + listCount);
	}

	public void traversalList(ListNode n) {
	//	ListNode n = head;
		while (n != null) {
			System.out.print(n.val + "------>");
			n = n.next;
		}

	}

	public String findelemRecursive(ListNode findElem, int key) {

		if (findElem == null)

			return "Not Found";

		else if (key == findElem.val)
			return "Found the value " + key;

		else
			return findelemRecursive(findElem.next, key);

	}

	public ListNode reversUtil(ListNode curr, ListNode prev) {
		if (curr.next == null) {
			demo.head = curr;
			curr.next = prev;
			return null;
		} else {
			ListNode next = curr.next;
			curr.next = prev;
			reversUtil(next, curr);

		}
		return null;
	}

	// Floyd Cycle Detection Algorithm.
	public void detectLoop(ListNode slowPoint,ListNode fastPoint) {
		//ListNode slowPoint = demo.head;
		//ListNode fastPoint = demo.head;
		
		while (slowPoint != null && fastPoint != null && fastPoint.next != null) {
			slowPoint = slowPoint.next;
			fastPoint = fastPoint.next.next;

			if (slowPoint == fastPoint) {
				System.out.println("Cycle detected");
				break;
			}

		}

		return;

	}
	
	
	public ListNode mergeSortedList(ListNode a,ListNode b)
	{
		ListNode result = null;
		if(a==null)
			return b;
		if(b==null)
			return a;
		if(a.val <= b.val){
			result = a;
			result.next = mergeSortedList(a.next,b);
			}
		else{
			result = b;
			
			result.next=mergeSortedList(a,b.next);
		}
			
		return result;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo = new LinkedListDemo();
		demo.head = new ListNode(10);
		ListNode second = new ListNode(12);
		ListNode third = new ListNode(13);
		ListNode forth = new ListNode(14);
		ListNode fifth = new ListNode(15);
		// linking part:-

		demo.head.next = second;
		second.next = third;
		third.next = forth;
		forth.next = fifth;
		fifth.next = null;
		
		
		// Second list
		
		demo.headTwo =  new ListNode(3);
		ListNode secondTwo = new ListNode(5);
		ListNode thirdTwo = new ListNode(7);
		ListNode forthTwo = new ListNode(8);
		ListNode fifthTwo = new ListNode(10);
		
		demo.headTwo.next = secondTwo;
		secondTwo.next = thirdTwo;
		thirdTwo.next = forthTwo;
		forthTwo.next = fifthTwo;
		fifthTwo.next = null;
		
		// Test Traversal
		 demo.traversalList(demo.head);
		 System.out.println(" ");
		 demo.traversalList(demo.headTwo);
		 
		 demo.mergeSortedList(demo.head,demo.headTwo);
		 
		 // To decide which node will become the newhead node;
		 
		 ListNode newhead = ((demo.head.val<=demo.headTwo.val)? demo.head:demo.headTwo);
				 
		 demo.traversalList(newhead);
		//demo.detectLoop();

		// Test FindCount
		// demo.findCount();
		// demo.reversUtil(demo.head, null);

		// Test find element in the list
		// System.out.println(demo.findelemRecursive(demo.head,1));

		// System.out.println("After revers in recursion " );

		// demo.traversalList();
	}

}
