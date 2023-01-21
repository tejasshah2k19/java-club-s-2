package exception;

import java.io.File;
import java.io.IOException;

public class Exception2 {
	public static void main(String[] args) throws IOException{
		File f = new File("demo.pdf");

		f.createNewFile();// IOException
	}
}
