package com.demonstration.study.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


//Reading files
public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
		//file to create and path to store it
		String url = "./resources/file-write.txt";
		Path filePath = Paths.get(url);
		
		//Things to write to file
		List<String> list = List.of("Apple","Boy","Cat","Dog","Elephant");
		
		Files.write(filePath, list);

	}

}
