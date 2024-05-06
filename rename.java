package filehandling;
import java.io.*;
public class rename {
	
	public static void main(String [] args)
	{
		File f = new File ("C:\\Users\\91782\\Desktop\\lc.txt");
		File r = new File ("C:\\Users\\91782\\Desktop\\yuvi.txt");
		
		if(f.exists())
		{
			System.out.println(f.renameTo(r));
		}
		else
		{
			System.out.println("file does not exist");
		}
	}

}
