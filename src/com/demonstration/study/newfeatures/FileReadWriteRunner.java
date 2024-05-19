package com.demonstration.study.newfeatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {

	public static void main(String[] args) throws IOException {
		//Read File
		Path path = Paths.get("./resources/sample.txt");
		String fileContent = Files.readString(path);
		System.out.println(fileContent);
		
		//Create and write content to file
		String newFileContent = fileContent.replaceAll("Line", "Lines");
		Path newFilePath = Paths.get("./resources/sample-new.txt");
		Files.writeString(newFilePath, newFileContent);
	}

}
