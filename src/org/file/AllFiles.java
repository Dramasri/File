package org.file;

import java.io.File;

public class AllFiles {
	
	public static void main(String[] args) {
		
		File f=new File("E:\\CoreJava");
		
		String[] list = f.list();
		
		// to print//
		for (String x : list) {
			
			System.out.println(x);
			
		}
		
		// for loop//
		
		for(int i=0;i<list.length;i++) {
			
			System.out.println(list[i]);
		}
		
	}

}
