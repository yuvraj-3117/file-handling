package filehandling;
import java.io.*;

public class readfile {

	public static void main(String[] args) {
		
		try
		{
		FileReader r = new FileReader("C:\\Users\\91782\\Desktop\\lc.txt");		
try
{
	int i;
	while((i=r.read())!=-1)  //read charector by charector -1 nhi aata jabtk
	{
		System.out.print((char)i); //integer ke form me data ayga charter ke foerm me lana he
	}}
	finally
	{
		r.close();
	}
}
	
	catch(Exception i)
	{
		System.out.println(i);
	}
}

}
