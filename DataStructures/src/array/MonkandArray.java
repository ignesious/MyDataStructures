package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MonkandArray {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // Reading input from STDIN

		for (int i = 0; i < T; i++) {

			// Loop for testCaseExecution
			int array[];
			String nandk = br.readLine();
			String[] parts = nandk.split(" ");
			int N = Integer.parseInt(parts[0]);
			int K = Integer.parseInt(parts[1]);
			array = new int[N];

			String arrValue = br.readLine();
			String[] arrparts = arrValue.split(" ");

			for (int u = 0; u < arrparts.length; u++) {
				array[u] = Integer.parseInt(arrparts[u]);
			}

			/*
			 * for(int j=0;j<array.length;j++) {
			 * System.out.print(array[j]+"\t"); }
			 */

			// System.out.println("K " + K);
			// System.out.println("arr length " + array.length);

			// Code Logic Block
			String flag = "true";
			int time = 0;
			while (true) {

				for (int jk = 0; jk < array.length; jk++) {

					if (array[jk] < K) {

						array[jk]++;
						flag = "false";

					}

					// System.out.print(array[jk] + "\t");

				}

				if (flag.equals("false")) {
					time++;
				}

				if (flag.equals("true")) {
					break;
				} else {
					flag = "true";
				}

			}

			System.out.println(time);

		}
	}

}
