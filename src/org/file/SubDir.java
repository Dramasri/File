package org.file;

import java.io.File;

public class SubDir {
	
	
	public static void main(String[] args) {
		
		File f=new File("E:\\Dir\\Javaeclipse\\Photon");
		
		boolean mk = f.mkdirs();
		
		System.out.println(mk);
		
		
		
	}

}
