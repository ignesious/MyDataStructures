package heap;

import java.util.Comparator;
import java.util.PriorityQueue;


/*
 * https://practice.geeksforgeeks.org/problems/heap-sort/1
 */


class makeMaxHeap implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2 - o1;
	}

}

public class HeapSort {

	public static void heapSort(int input[]) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(
				new makeMaxHeap());
		int heapSortedArray[] = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			buildHeap(minHeap, input[i]);
		}

		for (int i = 0; i < input.length; i++) {
			heapSortedArray[i] = minHeap.poll();
			System.out.print(heapSortedArray[i] + "\t");
		}
		// System.out.println("Final Sorted array of the heap" +
		// heapSortedArray);

	}

	private static void buildHeap(PriorityQueue<Integer> minHeap, int i) {
		// TODO Auto-generated method stub

		minHeap.add(i);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = { 29, 36, 12, 1, 12, 8, 9, 45 };
		heapSort(input);
	}

}
