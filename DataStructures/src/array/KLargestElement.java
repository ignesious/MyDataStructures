package array;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * https://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/
 */

class pqsort implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {

		return o1 - o2;
	}

}

public class KLargestElement {

	private void constructHeap(PriorityQueue<Integer> q, int input[]) {
		// Looping input Array

		for (int in : input) {
			q.add(new Integer(in));
		}

	}

	private int extractkmin(PriorityQueue<Integer> q, int k)

	{

		for (int i = 1; i <= k; i++) {

			System.out.println("Peeking the head" + q.peek());
			System.out.println("Polling the head" + q.poll());

		}

		return 0;

	}

	private int findKLargestElement(int input[], int k) {
	//	PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(new pqsort());
		//constructHeap(pQueue, input);

	//	System.out.println("Elements of priority Queue--->" + pQueue);
	//	extractkmin(pQueue, k);
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KLargestElement klarge = new KLargestElement();
		int a[] = { -1, 1, 1, 3, 4, 7, 6, 9, 8 };
		klarge.findKLargestElement(a, 2);
	}

}
