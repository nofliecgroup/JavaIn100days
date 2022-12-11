import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of scores:");
		int size = scanner.nextInt();
		 
		int[] grades = new int [size];
		
		System.out.println("Enter " +  size +" Press Enter to add more scores: ");

		for(int i=0; i<size; i++) {
			grades[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		for(int i=0; i<size; i++) {
			System.out.println("Grades entered are: " + grades[i]);
		}
		

	}

}
