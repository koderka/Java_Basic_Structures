package pl.koderka.readingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main9 {

    public static void main(String[] args) {
    	File file = new File("text2.txt");
    	StringBuilder builder = new StringBuilder();
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				String line = scan.nextLine();
				System.out.println(line);
				builder.append(line);
				builder.append("\n");				
			}
			scan.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		StringTokenizer tok = new StringTokenizer(builder.toString(), "\n");
		String[] tabTok = new String[tok.countTokens()];
		for(int i = 0; tok.hasMoreTokens(); i++) {
			tabTok[i] = tok.nextToken();
		}
		List<String> list = Arrays.asList(tabTok);
		Collections.sort(list);
		System.out.println(list);

    }
}