package com.demonstration.study.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		//Lists the files in the root folder
		Path currentDirectory = Paths.get(".");
		Files.list(currentDirectory).forEach(System.out::println);
		
		
		//recursive walk through directories
		Predicate<? super Path> predicate = path->String.valueOf(path).contains(".java");
		Files.walk(currentDirectory, 5)
			.filter(predicate)
			.forEach(System.out::println);
		
		//Another way to recursively walk through directories 
		//using the path
		BiPredicate<Path, BasicFileAttributes> javaMatcher =  (path, attributes) -> String.valueOf(path).contains(".java");
		//Files.find(currentDirectory, 5, javaMatcher).forEach(System.out::println);
		
		//using the attribute
		BiPredicate<Path, BasicFileAttributes> directoryMatcher =  (path, attributes) -> attributes.isDirectory();
		Files.find(currentDirectory, 5, directoryMatcher).forEach(System.out::println);
	}

}
