package pl.koderka.readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main8 {

    public static void main(String[] args) {
    
    	PrintWriter out;
		try {
			out = new PrintWriter("text8.txt");
			out.println("1.1, 1.2, 1.3, 2.0, 1.8");
	    	out.println("1.3, aa, 4.5, 6.7, 2.1");
	    	out.println("3.5, 7.7, 9.9, 4.1, 2.1");
	    	out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		File file = new File("text5.txt");
		double sum = 0;
		
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				String line = scan.nextLine();
				System.out.println(line);
				sum += lineSum(line);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(sum);
		
    }
    public static double lineSum(String line) {
    	double sum = 0;
    	StringTokenizer tok = new StringTokenizer(line, " ,");
    	while(tok.hasMoreTokens()) {
    		try {
    			sum = Double.parseDouble(tok.nextToken()) + sum;
    		} catch (NumberFormatException e){
    			
    		}
    	}
    	return sum;
    }
}

