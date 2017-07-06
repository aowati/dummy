package com.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Run{
	
	public static void main(String[] args) throws IOException{
		String filename = System.getProperty("user.dir") + "//resources//build.txt";

		File file = new File(filename);

		if (!file.exists()) {
			file.createNewFile();
		}	
		Boolean append_to_file = true;
		FileWriter writer = new FileWriter(file.getAbsolutePath(), append_to_file);
		BufferedWriter bw = new BufferedWriter(writer);
		bw.write("**********************************************\n");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
		bw.write("Built on Hooked time: " + sdf.format(date) + "\n"); 		

		bw.close();
		writer.close();

	}
}
