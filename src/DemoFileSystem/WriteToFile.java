package DemoFileSystem;
//package filesinJava;
import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter myWriter = new FileWriter("Assign.txt");
			myWriter.write("welcom to micron");
			myWriter.close();
			System.out.println("Successfully wrote the file");
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
