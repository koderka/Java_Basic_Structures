package pl.koderka.readingFiles;

import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
    	getData();

    }
    static void getData() {
    	int number = -1;
    	int sum = 0;
    	int numbersSum = 0;
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Podaj dowolną liczbę");

    	while(number != 0) {
            numbersSum++;
            number = scan.nextInt(); 
            System.out.println("Podaj kolejną dowolną liczbę");
    		
    		sum += number;
    		System.out.println("Ilość wpisanych liczb: " + numbersSum);
    		System.out.println("Suma wpisanych liczb: " + sum);
    	}
    }
}