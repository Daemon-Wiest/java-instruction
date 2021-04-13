package ui;

import java.io.IOException;
import java.nio.file.*;

public class FileProcessorApp {
//pg463
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to the file processor!");
String dirString="c:/temp/files";
Path dirPath=Paths.get(dirString);
//creates directory if it doesnt exist
if (Files.notExists(dirPath)) {
	Files.createDirectories(dirPath);
	System.out.println("directory created");
}
else {
	System.out.println("directory already exists");
}
//creates the file if it doesnt exist
String fileString = "product.txt";
Path filePath = Paths.get(dirString,fileString);
if (Files.notExists(filePath)) {
	Files.createFile(filePath);
	System.out.println("file created");
}
else {
	System.out.println("file already exists");
}
//display files in temp folder
if(Files.exists(dirPath) && Files.isDirectory(dirPath)) {
	System.out.println("Directory: "+dirPath.toAbsolutePath());
	System.out.println("Files: ");
	DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
	for (Path p: dirStream) {
		if(Files.isRegularFile(p));
		System.out.println("    "+p.getFileName());
	}
}
		
		
		
		
		
		
		
		
		System.out.println("Please leave");
	}

}
