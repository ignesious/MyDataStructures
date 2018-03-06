package LinkedList;

import java.util.ArrayList;

public class LinkedListTwo {

	ListNode head;
	ListNode headTwo;
	ListNode slowPointPali;
	ListNode fastPointPali;
	ListNode reverseCheck;
	ListNode newHead;
	ListNode slowcut ;
	int reorderSwitch=1;
	ArrayList<Integer> storeNodeValue = new ArrayList<Integer>();
	static LinkedListTwo demo;

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public int findCount(ListNode n) {
		// ListNode n = head;
		int listCount = 0;
		while (n != null) {
			// System.out.print(n.val+"------>");
			n = n.next;
			listCount++;

		}
		return listCount;
	}

	public void traversalList(ListNode n) {
		// ListNode n = head;
		while (n != null) {
			System.out.print(n.val + "------>");
			n = n.next;
		}
System.out.println("NULL");
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
			demo.reverseCheck = curr;
			curr.next = prev;
			return null;
		} else {
			ListNode next = curr.next;
			curr.next = prev;
			reversUtil(next, curr);

		}
		return null;
	}

	public ListNode reversUtilPali(ListNode curr, ListNode prev) {
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

	public ListNode returnSlowFastPalindrome(ListNode curr) {
		slowPointPali = curr;
		 slowcut = slowPointPali;
		fastPointPali = slowPointPali;

		while (fastPointPali != null && fastPointPali.next != null) {
			slowcut = slowPointPali;
			slowPointPali = slowPointPali.next;
			fastPointPali = fastPointPali.next.next;

		}

		slowcut.next = null;
		return slowPointPali;

	}

	// Floyd Cycle Detection Algorithm.
	public void detectLoop(ListNode slowPoint, ListNode fastPoint) {
		// ListNode slowPoint = demo.head;
		// ListNode fastPoint = demo.head;

		while (slowPoint != null && fastPoint != null && fastPoint.next != null) {
			slowPoint = slowPoint.next;
			fastPoint = fastPoint.next.next;

			if (slowPoint == fastPoint) {
				System.out.println("Cycle detected" + slowPoint.val);
				break;
			}

		}

		return;

	}

	public ListNode mergeSortedList(ListNode a, ListNode b) {
		ListNode result = null;
		if (a == null)
			return b;
		if (b == null)
			return a;
		if (a.val <= b.val) {
			result = a;
			result.next = mergeSortedList(a.next, b);
		} else {
			result = b;

			result.next = mergeSortedList(a, b.next);
		}

		return result;

	}

	public void isPalindrome(ListNode check) {
		boolean isEven = (this.findCount(check) % 2 == 0 ? true : false);
		boolean isPalindrome = true;
		ListNode tempNode;
		ListNode firstPoint, secondPoint;

		// System.out.println("Middle element is"+(this.returnSlowFastPalindrome(check)).val);
		this.returnSlowFastPalindrome(check);
		if (isEven) {
			// TODO for even block

			// Reverse the second half;

			this.reversUtilPali(demo.slowPointPali, null);
			firstPoint = demo.head;
			secondPoint = demo.reverseCheck;

			while (firstPoint != null && secondPoint != null) {
				if (firstPoint.val != secondPoint.val) {
					isPalindrome = false;
					break;
				} else {
					firstPoint = firstPoint.next;
					secondPoint = secondPoint.next;
				}

			}

			System.out.println("The palindrome result is " + isPalindrome);

		} else {
			// TODO for odd block
			tempNode = demo.slowPointPali;
			demo.slowPointPali = demo.slowPointPali.next;
			tempNode.next = null;
			this.reversUtilPali(demo.slowPointPali, null);

			firstPoint = demo.headTwo;
			secondPoint = demo.reverseCheck;

			while (firstPoint != null && secondPoint != null) {
				if (firstPoint.val != secondPoint.val) {
					isPalindrome = false;
					break;
				} else {
					firstPoint = firstPoint.next;
					secondPoint = secondPoint.next;
				}

			}

			System.out.println("The palindrome result is " + isPalindrome);

		}

	}

	public void removeDuplicates(ListNode dupli) {

		while (dupli != null && dupli.next != null) {
			if (dupli.val == dupli.next.val) {
				dupli.next = dupli.next.next;
			} else {
				dupli = dupli.next;
			}
		}
	}

	public void removeDuplicatesUnsorted(ListNode dupli) {

		while (dupli != null && dupli.next != null) {

			if ((dupli.val != dupli.next.val)
					&& !(demo.storeNodeValue.contains(dupli.next.val))) {

				System.out.println("distint first value storing in array"
						+ dupli.val);
				demo.storeNodeValue.add(dupli.val);

				dupli = dupli.next;

			} else {
				System.out.println("elem of array-->" + demo.storeNodeValue
						+ "Duplicate element" + dupli.next.val);
				dupli.next = dupli.next.next;

			}

		}
	}

	public void rotateList(ListNode rotatelist, int k) {

		// Determine k should be mod of length
		
		k = k % demo.findCount(rotatelist);
		
		if(k!=0){
		
		ListNode slowPoint, fastPoint;

		slowPoint = rotatelist;
		fastPoint = slowPoint;

		
		while (k != 0) {

			fastPoint = fastPoint.next;
			k--;
		}

		// Traverse till end of the list

		while (fastPoint.next != null) {

			slowPoint = slowPoint.next;
			fastPoint = fastPoint.next;

		}

	//	System.out.println("fastpoint in this node" + fastPoint.val + "SlowPoint in " + slowPoint.val);
		
		
		demo.newHead = slowPoint.next;
		slowPoint.next = null;
		fastPoint.next = demo.head;
		
		}
		
		else
		{
			System.out.println("Nothing to modify");
		}

	}

	/*
	 * public void createIntersectionList(ListNode first, ListNode second) {
	 * 
	 * while (first != null) { // System.out.print(n.val + "------>");
	 * demo.storeNodeValue.add(first.val); first = first.next; } while (second
	 * != null) { // System.out.print(n.val + "------>"); if
	 * (demo.storeNodeValue.contains(second.val)) {
	 * 
	 * System.out.println("i will add this shit" + second.val); }
	 * 
	 * second = second.next; }
	 * 
	 * }
	 * 
	 * Junk method hence commenting.....!!!
	 */

	public void createIntersectionList(ListNode first, ListNode second) {

		while (first != null && second != null) {

			if (first.val == second.val) {
				System.out.println("Intersecting hence will add" + first.val
						+ "second val" + second.val);

				first = first.next;
				second = second.next;

			} else if (first.val < second.val) {
				first = first.next;
			} else
				second = second.next;

		}

	}
	
	
	
	
	public void reorderList(ListNode check)
	{
		boolean isEven = (this.findCount(check) % 2 == 0 ? true : false);
		ListNode p1, p2,preMiddle;
		this.returnSlowFastPalindrome(check);
		
		
		if (isEven) {
			// TODO for even block

			// Reverse the second half;

			this.reversUtil(demo.slowPointPali, null);
			p1 = demo.head;
			p2 = demo.reverseCheck;
      preMiddle=demo.slowcut;
			while(p1!=preMiddle){
                preMiddle.next=p2.next;
                p2.next=p1.next;
                p1.next=p2;
                p1=p2.next;
                p2=preMiddle.next;
            }
        }

			

		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo = new LinkedListTwo();
		demo.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode forth = new ListNode(4);
		//ListNode fifth = new ListNode(5);
		// linking part:-

		demo.head.next = second;
		second.next = third;
		third.next = forth;
		forth.next = null;
		//forth.next = fifth;

		//fifth.next = null;

		// Second list

		demo.headTwo = new ListNode(1);
		ListNode secondTwo = new ListNode(2);
		ListNode thirdTwo = new ListNode(3);
		ListNode forthTwo = new ListNode(4);
		ListNode fifthTwo = new ListNode(10);

		demo.headTwo.next = secondTwo;
		secondTwo.next = thirdTwo;
		thirdTwo.next = forthTwo;
		forthTwo.next = fifthTwo;
		fifthTwo.next = null;

		// demo.traversalList(demo.head);

		// System.out.println("\n");

		 demo.traversalList(demo.head);

		// demo.createIntersectionList(demo.head, demo.headTwo);

		//demo.rotateList(demo.head, 17);
		//System.out.println("  ");
		// demo.traversalList(demo.newHead);
		 
		 
		 demo.reorderList(demo.head);
		 
		System.out.println("  ");
		 demo.traversalList(demo.head);
		//System.out.println("  ");
		// demo.traversalList(demo.reverseCheck);
		// System.out.println("  ");
		 
		 

	}

}
