// MOTORCYCLE FUEL BUDGET TRACKER
import java.util.Scanner;
public class Whileloop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("MOTORCYCLE FUEL BUDGET TRACKER");
		System.out.println("================================");
		int Budget = 1500;
		System.out.println("Current Budget: ₱"+Budget);
		while (Budget>0) {
		System.out.print("Day");
		int day = input.nextInt();
		System.out.print("ENTER FUEL EXPENSE:");
		int Expense = input.nextInt();
		if (Expense <= 0 || Expense > Budget) {
			System.out.println("Not enoung money");
			continue;
			}	
		Budget = Budget - Expense;
		System.out.println("Remaining Budget: ₱"+ Budget);

	
			}
		System.out.println("YOUR BUDGET IS ALL GONE!!!");
		input.close();

		}
}