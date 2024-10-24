import java.util.*;
import java.io.*;
import java.io.FileWriter;
import java.io.File;
public class FileReaderandWriter
{ 
	public static void main(String [] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			File ob1=new File("Reg1.txt");
			ob1.createNewFile();
			System.out.println("Reg1.txt created\n");
			FileWriter fout=new FileWriter("Reg1.txt");
			System.out.println("Enter KEAM Rank number:");
			int n=sc.nextInt();
			fout.write(n+ "\n");
			fout.close();
			System.out.println("Data added");
			FileReader fin=new  FileReader("Reg1.txt");
			BufferedReader br=new BufferedReader(fin);
			String line;
			System.out.println("\nContents of Reg1.txt is");
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
			br.close();
		}
		catch(IOException e) {
		System.out.println("Exception occured"+e.getMessage());
		}
	}
}




































