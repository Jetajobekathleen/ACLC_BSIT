public class Main {
	public static void main(String[] args) {
		
		int num = 527;
	
		int a = num / 100;
		int b = (num /10) % 10;
		int c = num % 10;
		
		int sum = a + b + c;
		int product = a * b * c;
		
		System.out.println("Sum =" + sum);
		System.out.println("Product =" + product);
		
	}
}