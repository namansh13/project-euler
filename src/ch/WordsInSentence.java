package ch;

import java.io.*;
import java.util.*;

public class WordsInSentence {
	public static void main(String[] args) throws IOException {
		Map<String, Integer> a = new HashMap<String, Integer>();
		String s;
		System.out.print("Enter the Sentence : ");
		String line = "";
		String paragraph = "";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(isr);
		do {
			line = bufferedReader.readLine();
			paragraph = paragraph + line + " ";
		} while (!line.equals("exit"));
		s = paragraph;
		long e, st;
		st = System.currentTimeMillis();
		String[] out = s.split(" ");
		System.out.println(out.length);
		for (int i = 0; i < out.length; i++) {
			int count = 1;
			for (int j = i + 1; j < out.length; j++) {
				if (out[i].toLowerCase() == out[j].toLowerCase()) {
					count++;
				}
			}

			a.put(out[i].toLowerCase(), 1);
		}
		for (String key : a.keySet()) {
			int count = 0;
			for (int i = 0; i < out.length; i++) {
				if (out[i].toLowerCase().equals(key)) {

					count++;
				}
			}
			a.put(key, count);
		}
		for (Map.Entry<String, Integer> entry : a.entrySet()) {
			String key = entry.getKey();
			int t = entry.getValue();
			System.out.println(key + " " + t);

		}
		e = System.currentTimeMillis();
		System.out.printf("Total time taken : %d s", (e - st) / 1000);
	}
}