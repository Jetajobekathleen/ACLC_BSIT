// Ordering food in a restaurant
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner food= new Scanner(System.in);
					System.out.println("===========RESTAURANT===========");
		System.out.println("===Unli rice and unli drinks===");
				System.out.println("1. Fried Chicken           ₱99");
			System.out.println("2. Menudo                  ₱120");
			System.out.println("3. Sinigang                ₱99");
			System.out.println("4. Adobo                   ₱110");
			System.out.println("5. Tinola                  ₱99");
			System.out.println("6. Dinuguan                ₱129");
			System.out.println("7. 3pcs Barbeque(pork)      ₱120");
			System.out.println("8.Boneless Bagus           ₱150");
			System.out.println("9.Bicol Express            ₱129");
			System.out.println("10. Igado                  ₱120");
			System.out.println("================================");

			
		int choice;
		int quantity;
		int price;
		int total= 0;
		String again;
		 do {
		 //chossing food system
		 			System.out.print("Choose food 1-10:");
		 		choice = food.nextInt();
		 		switch(choice){
		 		case 1:
		 		price = 99;
		 		break;
		 		case 2:
		 		price = 120;
		 		break;
		 		case 3:
		 		price = 99;
		 		break;
		 		case 4:
		 		price = 110;
		 		break;
		 		case 5:
		 		price = 99;
		 		break;
		 		case 6:
		 		price = 129;
		 		break;
		 		case 7:
		 		price = 120;
		 		break;
		 		case 8:
		 		price = 150;
		 		break;
		 		case 9:
		 		price = 129;
		 		break;
		 		case 10:
		 		price = 110;
		 		break;
		 		default:
		 		price = 0;
		 		System.out.println("INVALID FOOD CHOICE");
		 		}
		 		if (price > 0) {
		 			System.out.print("Enter Quantity:");
		 quantity = food.nextInt();
		 if (quantity > 0) {
		 	int subtotal = price * quantity;
		 	total += subtotal;
		 	System.out.println("Price per Item: ₱"+price);
		 	System.out.println("Quantity:"+ quantity);
		 	System.out.println("Subtotal: ₱"+ subtotal);
		 } else {
		 	 	System.out.println("Invalid Quantity!!!");
		 }
			}
			System.out.print("Order another food?(Yes/No): ");
			again = food.next();
			
				}while (again.equalsIgnoreCase("Yes"));
				System.out.println("==========Final Reciept==========");
				System.out.println("Total cost: ₱"+ total);
				System.out.println("THANK YOU FOR ORDERING!!!");
				
			food.close();
							
	}
}