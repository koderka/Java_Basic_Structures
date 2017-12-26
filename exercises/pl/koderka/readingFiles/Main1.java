package pl.koderka.readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
    	System.out.println(count("text1.txt"));

    }
    static int count(String fileName) {
    	File file = new File(fileName);
    	int count = 0;
    	try {
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				count += scan.nextLine().length();
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	return count;
    }

}
