package array;
/*
 * https://algorithms.tutorialhorizon.com/rearrange-positive-and-negative-numbers-of-array-on-each-side-in-onlogn/
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class pqsort1 implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {

		return o2 - o1;
	}

}

public class PositiveNegetive {

	public void heapify(PriorityQueue<Integer> q, int input[]) {
		for (int i : input) {
			q.add(new Integer(i));
		}
	}

	public void seperatePositiveNegetive(int input[]) {
	//	PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(new pqsort1());

	//	heapify(pQueue, input);
		ArrayList<Integer> finalArray = new ArrayList<Integer>();
		// Seperation

	//	while (pQueue.peek() != null) {
	//		finalArray.add(pQueue.poll());
	//	}

		System.out.println("Final Array is" + finalArray);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositiveNegetive positiveNegetive = new PositiveNegetive();
		int input[] = { 1, -2, -3, 4, 5, -2, -6 };
		positiveNegetive.seperatePositiveNegetive(input);
	}

}
