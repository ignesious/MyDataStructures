package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonkandWelcome {

	// Function to split the values

	public int[] splitter(String arrValue) {
		String[] parts = arrValue.split(" ");
		int array[] = new int[parts.length];
		for (int u = 0; u < parts.length; u++) {
			array[u] = Integer.parseInt(parts[u]);
		}

		return array;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		MonkandWelcome monkObj = new MonkandWelcome();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // Reading input from STDIN

		int a[], b[];
		a = new int[T];
		b = new int[T];
		a = monkObj.splitter(br.readLine());
		b = monkObj.splitter(br.readLine());
		for (int j = 0; j < T; j++) {
			System.out.print(a[j]+b[j]+" ");
		}

	}

}
