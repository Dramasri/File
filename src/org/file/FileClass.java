package org.file;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileClass {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("E:\\Selenium\\Note.txt");
		
		boolean mk = f.mkdir();
		
		System.out.println(mk);
		
		//File f=new File("E:\\Selenium\\Note.txt");
		
		boolean b = f.createNewFile();
		
		System.out.println(b);
		
		// to write a line/
		
		
		FileUtils.write(f, "List is an interface");
		FileUtils.write(f, "\n Set is an interface", true);
		FileUtils.write(f, "\n Map is an interface", true);
		FileUtils.write(f, " \n All these comes under collections", true );
		FileUtils.write(f, "\n Collection is also an interface", true);
		FileUtils.write(f, "\n Array is an index based value",true);
		FileUtils.write(f, "\n It allows duplicates",true);
		
		
		
		List<String> rd = FileUtils.readLines(f);
		// to iterate inside the loop//
		
		// to get the size//
		
		int size = rd.size();
		System.out.println("The row count is"+size);
		
		// for loop//
		
		for(int i=0;i<rd.size();i++)
		{
			
			if(i>=2) {
			System.out.println("The last five lines are" +rd.get(i));
					
		}
			
			
			// to print the odd lines from the file//
			
			//for(int i=0;i<rd.size();i++) {
				
				//if(i%2==0) {
					//System.out.println(rd.get(i));
				//}
				
				//for (String k : rd) {
					
					//System.out.println(k);
					
				//}		
		
	}
		
		
}
}