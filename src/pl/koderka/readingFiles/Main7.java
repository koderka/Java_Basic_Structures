package pl.koderka.readingFiles;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
                PrintWriter out = new PrintWriter("Main7.txt");
                String line = "";
                System.out.println("Wpisz kolejne linie i zakończ quit:");
                while(true) {
                        line = scan.nextLine();
                        if(line.equals("quit")) {
                                break;
                        }
                        out.println(line);
                }
                out.close();
        } catch (FileNotFoundException e) {
                e.printStackTrace();
        }   
	}
}