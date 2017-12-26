package pl.koderka.readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
    	rewrite();
    }
    static void rewrite() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Wczytaj nazwe pliku");
    	String fileName = scan.nextLine();
    	File file = new File(fileName);
    	try {
    		int splitter = fileName.indexOf('.');
    		String fileName2 = fileName.substring(0, splitter) + "_2" + fileName.substring(splitter);
    		PrintWriter out = new PrintWriter(fileName2);
    		
    		for(int i = 0; i < 2; i++) {
    			scan = new Scanner(file);
    			
    			while(scan.hasNextLine()) {
    				out.println(scan.nextLine());
    			}
    		}
			out.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
    }
}
