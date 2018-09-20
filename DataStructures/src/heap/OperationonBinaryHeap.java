package heap;

import java.util.PriorityQueue;

/*
 * https://practice.geeksforgeeks.org/problems/operations-on-binary-min-heap/1
 */
public class OperationonBinaryHeap {

	static PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

	public static void insert(int i) {
		minHeap.add(i);
	}

	public static void delete() {
		minHeap.poll();
	}

	public static void print() {
		System.out.println(minHeap.peek());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		insert(6);
		insert(7);
		delete();
		delete();
		delete();
		delete();
		delete();
		print();
	}

}
