package com.demonstration.study.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//Reading files
public class FileReadRunner {

	public static void main(String[] args) throws IOException {
		//Lists the files in the root folder
		String url = "./resources/data.txt";
		Path filePath = Paths.get(url);
		//This is only good for small files 
		//List<String> lines = Files.readAllLines(filePath);
		//System.out.println(lines);
		
		//A more efficient way: reading the file line by line
		Files.lines(filePath)
			.filter(str-> str.contains("a"))
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
	}

}
