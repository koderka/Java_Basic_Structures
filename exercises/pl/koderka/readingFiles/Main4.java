package pl.koderka.readingFiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
    	System.out.println(sortedArray());

    }
    static ArrayList<Integer> sortedArray() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Podaj, ile liczb należy wylosowac");
    	int numbers = scan.nextInt();
    	
    	Random generator = new Random();
    	ArrayList<Integer> arr = new ArrayList<>();
    	for(int i = 0; i < numbers; i++) {
    		arr.add(generator.nextInt(101));
    	}
    	Collections.sort(arr);
    	return arr;
    }
}