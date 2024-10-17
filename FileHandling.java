import java.io.*;
public class FileHandling {
	public static void main(String args[]) {
		try {
		FileInputStream fin=new FileInputStream("File1.txt");
		FileOutputStream fout=new FileOutputStream("File2.txt");
		int i;
		while((i=fin.read())!=-1) {
			fout.write(i);
		} System.out.println("Successfully wrote to specific file");
		fin.close();fout.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
