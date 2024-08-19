package DemoFileSystem;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myObj = new File("rit1.txt");
			Scanner myReader = new Scanner(myObj);
			
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred- File not found");
			e.printStackTrace();
		}

	}

}
