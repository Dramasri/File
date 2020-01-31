package org.file;

import java.io.File;

public class CheckDir {
	
	public static void main(String[] args) {
		
		File f=new File("E:\\JavaSel");
		
		boolean ex = f.exists();
		
		System.out.println(ex);
		
		if(ex==false) {
			
			boolean mk = f.mkdir();
			
			System.out.println(mk);
		}
		
		
	}
	

}
