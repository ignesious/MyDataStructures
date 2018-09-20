package heap;

import java.util.Comparator;
import java.util.PriorityQueue;
/*
 * https://www.geeksforgeeks.org/median-of-stream-of-integers-running-integers/
 * https://www.youtube.com/watch?v=VmogG01IjYc
 * https://practice.geeksforgeeks.org/problems/find-median-in-a-stream/0
 */
class maxHeap implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2 - o1;
	}
}

public class MedianStream {

	public static double getMedian(int input[]) {

		PriorityQueue<Integer> lowers = new PriorityQueue<Integer>(
				new maxHeap());
		PriorityQueue<Integer> highers = new PriorityQueue<Integer>();
		double medianRunTime = 0;

		for (int i = 0; i < input.length; i++) {

			addElement(input[i], lowers, highers);
			rebalance(lowers, highers);
			medianRunTime = getPresentMedian(lowers, highers);
			System.out.println("At present the median is--------->  "
					+ medianRunTime);

		}
		return medianRunTime;

	}

	private static double getPresentMedian(PriorityQueue<Integer> lowers,
			PriorityQueue<Integer> highers) {
		// TODO Auto-generated method stub

		if (lowers.size() == highers.size()) {
			return (double) (lowers.peek() + highers.peek()) / 2;
		} else {
			PriorityQueue<Integer> biggestHeap = lowers.size() > highers.size() ? lowers
					: highers;
			return biggestHeap.peek();

		}

	}

	private static void rebalance(PriorityQueue<Integer> lowers,
			PriorityQueue<Integer> highers) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> biggestHeap = lowers.size() > highers.size() ? lowers
				: highers;
		PriorityQueue<Integer> smallestHeap;
		if (biggestHeap == lowers)

			smallestHeap = highers;

		else
			smallestHeap = lowers;

		if ((biggestHeap.size() - smallestHeap.size()) >= 2) {
			smallestHeap.add(biggestHeap.poll());
		}

	}

	private static void addElement(int i, PriorityQueue<Integer> lowers,
			PriorityQueue<Integer> highers) {

		if (lowers.size() == 0 || i < lowers.peek()) {
			lowers.add(i);
		} else
			highers.add(i);

		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = { 5, 15, 1, 3 };

		System.out.println("Final Median is ---->" + getMedian(input));

	}

}
