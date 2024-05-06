package filehandling;

import java.io.*;//filewiter or on ecepxetion keliye

public class fileWritter {
	public static void main(String[] args) {
		try
		{
		FileWriter f = new FileWriter("c:\\users\\91782\\Desktop\\lc.txt");
		try
		{
			f.write("java programing best programing languege");
		}
		finally
		{
			f.close();
		}
		System.out.println("successfully data wrote in file");
	}

	catch(IOException i) 
	{
		System.out.println("Exception handled");
	}}}
	