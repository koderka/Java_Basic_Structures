package pl.koderka.readingFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main10 {

    public static void main(String[] args) {

    	createDirectory("plik_nio");
    }
    static void createDirectory(String fileName) {
    	Path newDir = Paths.get(fileName);
    	if(!Files.exists(newDir)) {
    		try {
				Files.createDirectories(newDir);
				System.out.println(fileName + " has been created");
			} catch (IOException e) {
				e.printStackTrace();
			}
    	} else {
    		System.out.println(fileName + " exists!");
    	}
    }
}