package LinkedList;

public class LinkedListDemo {

	ListNode head;
	ListNode headTwo;
	ListNode slowPointPali;
	ListNode fastPointPali;
	ListNode reverseCheck;
	static LinkedListDemo demo;

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
		ListNode slowcut = slowPointPali;
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
				System.out.println("Cycle detected");
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo = new LinkedListDemo();
		demo.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(2);
		ListNode forth = new ListNode(1);
		// ListNode fifth = new ListNode(15);
		// linking part:-

		demo.head.next = second;
		second.next = third;
		third.next = forth;
		// forth.next = fifth;
		forth.next = null;
		// fifth.next = null;

		// Second list

		demo.headTwo = new ListNode(1);
		ListNode secondTwo = new ListNode(2);
		ListNode thirdTwo = new ListNode(1);
		ListNode forthTwo = new ListNode(2);
		ListNode fifthTwo = new ListNode(1);

		demo.headTwo.next = secondTwo;
		secondTwo.next = thirdTwo;
		thirdTwo.next = forthTwo;
		forthTwo.next = fifthTwo;
		fifthTwo.next = null;

		// Test Traversal
		demo.traversalList(demo.head);
		// System.out.println(" ");
		// demo.traversalList(demo.headTwo);

		demo.isPalindrome(demo.head);

		System.out.println("After reversal printing the First half");

		demo.traversalList(demo.head);

		System.out.println("After reversal printing the second half");

		demo.traversalList(demo.reverseCheck);

		// demo.mergeSortedList(demo.head,demo.headTwo);

		// To decide which node will become the newhead node;

		// ListNode newhead = ((demo.head.val<=demo.headTwo.val)?
		// demo.head:demo.headTwo);

		// demo.traversalList(newhead);

		// demo.detectLoop();

		// Test FindCount
		// demo.findCount();
		// demo.reversUtil(demo.head, null);

		// Test find element in the list
		// System.out.println(demo.findelemRecursive(demo.head,1));

		// System.out.println("After revers in recursion " );

		// demo.traversalList();

	}

}
