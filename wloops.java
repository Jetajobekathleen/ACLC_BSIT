public class Main {
    public static void main(String[] args) {

        int balance = 1000;
        int withdrawal = 300;

        while (balance >= withdrawal) {

            System.out.println("Current Balance: " + balance);
            System.out.println("You withdrew: " + withdrawal);

            balance = balance - withdrawal;

            System.out.println("Remaining Balance: " + balance);
          
        }

        System.out.println("Not enough balance.");
        System.out.println("Transaction ended.");
    }
}