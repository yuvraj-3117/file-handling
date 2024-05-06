package filehandling;
import java.io.*;

public class fileinfo {

	public static void main(String[] args) {
		File f = new File("c:\\users\\91782\\Desktop\\lc.txt");
		if (f.exists())
		{

			System.out.println("file name"+f.getName());
			System.out.println("file writable"+f.canWrite());
			System.out.println("file readable"+f.canRead());
			System.out.println("file size"+f.length());
			System.out.println("file location"+f.getAbsolutePath());
			System.out.println("file delete"+f.delete());
		}
		else {
			System.out.println("file does not exists");
		}
	}

}
