package pl.koderka.readingFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main12 {

    public static void main(String[] args) {

    }

    static void copyFile(String directory, String fileName, String secondFileName) {
    	Path srcPath = Paths.get(directory, fileName);
    	Path destPath = Paths.get(directory, secondFileName);
    	
    	if(Files.exists(srcPath) && !Files.exists(destPath)) {
    		try {
				Files.copy(srcPath, destPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
    	} else {
    		System.out.println("Plik źródłowy nie istnieje");
    	}
    }
}