public class Main {
	public static void main(String[] args) {
		
		int num1 = 202;
		int num2 = 10;
		int num3 = 50;
		
		System.out.println("Number 1: " + num1);
		System.out.println("Number 2: " + num2);
		System.out.println("Number 3: " + num3);
		
		int greatest = (num1 > num2 && num1 > num3) ? num1 : (num2 > num1 && num2 > num3) ? num2 : num3;
		
		System.out.println("The greatest value is: " + greatest);
	}
}