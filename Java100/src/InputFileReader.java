import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputFileReader {

	public static void main(String[] args) {
		File file = new File("test.txt");
		Scanner sc = null; 
		//List<String> student = new ArrayList<String>();

		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File doesnt exist");
			e.printStackTrace();
		}
		
		while(sc.hasNextLine()) {
			//student.add(sc.nextLine());
			System.out.println("Item in file: \n" + sc.nextLine());
		}

	}

}
