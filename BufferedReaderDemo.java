
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) {
	
		InputStreamReader in=new InputStreamReader(System.in);
		
		try {		
			BufferedReader rd=new BufferedReader(in);
			String data= rd.readLine();
			System.out.println(data);		
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}