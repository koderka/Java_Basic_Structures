package pl.koderka.readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main3 {

    public static void main(String[] args) {    	
    	System.out.println(retirement());
    }
    
    static ArrayList<String> retirement() {
    	ArrayList<String> retiredPeople = new ArrayList<>();
    	final int actualYear = 2017;
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Podaj nazwę pliku: ");
    	
    	String nextLine = scan.nextLine();

    	File file = new File(nextLine);
    	try {
			scan = new Scanner(file);
			while(scan.hasNextLine()) {
				String line = scan.nextLine();
				StringTokenizer tabPerson = new StringTokenizer(line, " ");
				
				String firstname = tabPerson.nextToken();
				String surname = tabPerson.nextToken();
				int birthYear = Integer.parseInt(tabPerson.nextToken());
				String sex = tabPerson.nextToken();
				if((sex.equals("K") && actualYear - birthYear >= 60) || (sex.equals("M") && actualYear - birthYear >= 65)) {
					retiredPeople.add(firstname + " " + surname);					
				}
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 	
    	return retiredPeople;
    }
}
