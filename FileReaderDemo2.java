import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
	public static void main(String[] args) {
		try {	
			File file = new File("abx.txt");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);	
			String str = br.readLine();
			while(str!=null)	{
				System.out.println(str);
				str=br.readLine();
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}

