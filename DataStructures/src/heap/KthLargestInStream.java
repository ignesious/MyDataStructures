package heap;

import java.util.PriorityQueue;

/*Kth Largest Element will be the 
 * 
 * first min element in K elements min heap
 * 
 * think the shit you will get......!!!!!
 * 
 * ex- 3rd largest element in 3 element heap will be the first smallest element that is the logic ....
 * 
 * https://www.geeksforgeeks.org/kth-largest-element-in-a-stream/
 * 
 */

public class KthLargestInStream {

	public static void findKthLargestElementInStream(int input[], int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

		for (int i = 0; i < input.length; i++) {

			printKthLargest(minHeap, input[i], k);

		}

	}

	private static void printKthLargest(PriorityQueue<Integer> minHeap, int i,
			int k) {
		// TODO Auto-generated method stub

		minHeap.add(i);
		if (minHeap.size() < k) {
			System.out.print("-1"+"\t");
		}

		if (minHeap.size() > k) {
			minHeap.poll();
		}

		if (minHeap.size() == k) {
			System.out.print(minHeap.peek() + "\t");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = { 10, 20, 11, 70, 50, 40, 100, 5 };
		findKthLargestElementInStream(input, 3);
	}

}
