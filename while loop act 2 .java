import java.util.Scanner;

public class whilelooplogin123 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int attempts = 0;
		String password = "12345";
		while (attempts < 3) {
			System.out.println("Enter Password:");
			String UserInput = input.next ();
			if(UserInput.equals(password)) {
				System.out.println("WELCOME BACK:");
				break;		
	}
	attempts++;	
	}						
			if (attempts ==3 )
			System.out.println("Try Again in 67 Years, LOCKED!");
			}
		}
	
//While loop java
// Log in login 3 attempts
// password 12345
