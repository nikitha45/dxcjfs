
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class FileWriterDemo {
	
	public static void main(String[] args) {
	
	
		try {
		
			File file=new File("abx.txt");
			FileWriter out=new FileWriter(file,true);
			
			out.write("THIS IS NEW TXT");
			System.out.println("done");
			
			out.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
