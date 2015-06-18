package ch;

import java.io.File;

public class FolderSize {
	static long totalfolder = 0;
	static long totalfile = 0;

	public static void main(String[] args) {
		long e, s;
		s = System.currentTimeMillis();
		String folder = "C:/Java II and III week";
		long filesize = filesize(new File(folder));
		System.out.println("Folder size : "+filesize / Math.pow(2, 20) + " mb" + " (" + filesize
				+ ") bytes");
		System.out.println("Total files are : " + totalfile);
		System.out.println("Total subfolders are : " + (totalfolder - 1));
		System.out
				.println("Last Modified : " + new File(folder).lastModified());
		System.out.println("Attributes : " + new File(folder).isHidden());
		e = System.currentTimeMillis();
		System.out.printf("Total time taken : %d s", (e - s) / 1000);
	}

	public static long filesize(File folder) {
		totalfolder++;
		int i = 0;
		long filesize = 0;
		// System.out.println("Folder : " + folder);
		File[] file = folder.listFiles();
		// System.out.println(file.length);
		if (file.length == 0) {
			return 0;
		}
		do {
			if (file[i].isDirectory()) {
				filesize += filesize(file[i]);
			} else {
				totalfile++;
				filesize += file[i].length();
			}
			i++;
		} while (i < file.length);
		return filesize;
	}

}
