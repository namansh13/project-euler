package ch;

import java.io.*;
import java.util.*;

public class SF {
	public static void main(String... args) throws IOException {
		long e, s;
		s = System.currentTimeMillis();
		int count = 0;

		Map<String, String> map = new HashMap<String, String>();
		map = Mapper.mapper();
		for (String k : map.keySet()) {

			String[] st = map.get(k).split(" ");
			if (st[0].equals("Mckesson_SF")) {
				File filein = new File(k);

				File[] files = filein.listFiles();
				for (File file : files) {

					if (file.isFile() && file.getName().contains(st[1])) {
						System.out.println(file);
						try {
							FileInputStream f = new FileInputStream(file);
							InputStreamReader ir = new InputStreamReader(f);
							BufferedReader bf = new BufferedReader(ir);
							String str;

							while ((str = bf.readLine()) != null) {
								count++;
								String[] out = str.split("\\"
										+ str.substring(4, 5));
								/*
								 * System.out.println(out[1] + " | " + out[27] +
								 * " | " + out[28] + " | " + out[39] + " | " +
								 * out[40] + " | " + out[42] + " | " + out[43] +
								 * " | " + out[44]);
								 */

							}

							bf.close();
						} catch (IOException err) {
							System.out
									.println("Error while reading file line by line:"
											+ err.getMessage());
						}

					} else
						continue;
				}
			}
		}
		System.out.println(count);
		e = System.currentTimeMillis();
		System.out.printf("Total time taken : %d ms", (e - s));
	}
}
