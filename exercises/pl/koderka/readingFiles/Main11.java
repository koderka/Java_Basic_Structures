package pl.koderka.readingFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main11 {

    public static void main(String[] args) {
    	createFile("newfile.txt");
    }
    
    static void createFile (String fileName) {
    	Path path = Paths.get(fileName);
    	
    	if(!Files.exists(path)) {
    		try {
				Files.createFile(path);
				System.out.println("Plik o podanej nazwie został utworzony");
			} catch (IOException e) {
				e.printStackTrace();
			}	
    	} else {
    		System.out.println("Plik o tej nazwie już istnieje");
    	}
    }
}
