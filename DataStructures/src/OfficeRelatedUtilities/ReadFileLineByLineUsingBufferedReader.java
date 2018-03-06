package OfficeRelatedUtilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLineUsingBufferedReader {

	public static void main(String[] args) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"trans.txt"));
			String line = reader.readLine();
			while (line != null) {
				//System.out.println(line);
				
				String splitted[] = line.split("-");
				
				// For the second split
				
				String secondSplit[] = splitted[1].split("_");
				System.out.print(secondSplit[0]+",");
				
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}