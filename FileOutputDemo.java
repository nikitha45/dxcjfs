
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileOutputDemo {

	public static void main(String[] args) {	
		try {			
			FileOutputStream fout=new FileOutputStream("abx.txt",true);		
			PrintStream ps=new PrintStream(fout);		
			ps.println("hello");		
			System.out.println("DONE");	
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
