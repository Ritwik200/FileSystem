package DemoFileSystem;

import java.io.File;
import java.io.IOException;

public class DeleteFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myobj = new File("rit.xlsx");
			if(myobj.del) {
				System.out.println("File created: "+ myobj.getName());
				System.out.println("Absolute path: "+ myobj.getAbsolutePath());
			} else {
				System.out.println("File already exists");
			}
			} catch(IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
	}

}
