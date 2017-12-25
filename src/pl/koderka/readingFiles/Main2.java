package pl.koderka.readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) {
    	System.out.println(count("text2.txt"));

    }
    static int count(String fileName) {
    	File file = new File(fileName);
    	int count = 0;
    	try {
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				String line = scan.nextLine();
				StringTokenizer tabTok = new StringTokenizer(line, " ");
				count += tabTok.countTokens();	
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	return count;
    }
}
