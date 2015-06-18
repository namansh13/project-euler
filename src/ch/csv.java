package ch;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class csv {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fstream = new FileInputStream("c:\\a.txt");
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader bf = new BufferedReader(new InputStreamReader(in));
		Map<String, String> m = new HashMap<String, String>();
		String[] s = new String[1000];
		int y = 0;
		while ((s[y] = bf.readLine()) != null) {
			y++;
		}
		for (int i = 0; i < y; i++) {
			//System.out.println(s[i]);
		}
		int j = 0;
		String[][] out = new String[s.length][7];

		do {
			out[j] = s[j].split(",");
			j++;
		} while (j < y);
		for (int i = 0; i < y; i++) {
			System.out.println((out[i][0] + " " + out[i][1] + " " + out[i][2]).hashCode());
			m.put(out[i][0] + " " + out[i][1] + " " + out[i][2], out[i][3]
					+ " " + out[i][4] + " " + out[i][5] + " " + out[i][6]);
			// System.out.println(out[i][4] + " " + out[i][5]);
		}
		for(String key :m.keySet()){
			System.out.println(key+" "+m.get(key));
		}

	}
}
