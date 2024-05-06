package filehandling;
import java.io.*;
public class CreateFile {

	public static void main(String[] args) {//throws key word se bhi exception handl ho jyga
		
		File f = new File("c:\\users\\91782\\Desktop\\lc.txt");
		
		try {
		if (f.createNewFile())
		{
			System.out.println("file succcessfully created");
		}
		else
		{
			System.out.println("file already exists");
		}}
		catch(IOException i) {
			System.out.println("Exception handled");
			
		}

	}

}
