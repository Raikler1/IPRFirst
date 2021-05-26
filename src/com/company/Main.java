package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    File file1 = new File (args[0]);
		BufferedReader reader = new BufferedReader(new FileReader(file1));
		int lines = 0;
		while (reader.readLine() != null) lines++;
		reader.close();
		int linesInNewFile = lines/5;
		int linesInLastFile = lines-linesInNewFile*4;
		BufferedReader readerFile = new BufferedReader(new FileReader(file1));
		for (int i = 1; i <=5 ; i++) {
			FileWriter fw = new FileWriter(args[1]+i);
			if (i!=5) {
				for (int j = 0; j < linesInNewFile; j++) {
					fw.write(readerFile.readLine() + "\n");
				}
			} else {
				for (int j = 0; j < linesInLastFile; j++) {
					fw.write(readerFile.readLine() + "\n");
				}
			}
			fw.close();
		}
	}
}
