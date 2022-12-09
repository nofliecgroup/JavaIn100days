import java.util.Scanner;

public class PasswordMgnt {

	public static void main(String[] args) {
		String password = "letmein";
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please enter the password: ");
			String guess = scanner.nextLine();
			
			if(guess.equals(password)) {
				System.out.println("Password is OK ! Welcome");
				return;
			} else {
				System.out.println("Wrong credentials...");
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}
