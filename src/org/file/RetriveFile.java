package org.file;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class RetriveFile {
	
	public static void main(String[] args) throws IOException {
		
		//File f=new File("C:\\Java");
		
		//boolean h = f.mkdir();
		
		//System.out.println(h);
		
		File f1=new File("C:\\Java\\CoreJava.txt");
		
		boolean c = f1.createNewFile();
		
		System.out.println(c);
		
		FileUtils.write(f1, "Java is an programming language");
		
		List<String> l = FileUtils.readLines(f1);
		
		boolean con = l.contains("Java");
		
		System.out.println(con);
		
		
		
		
	}

}
