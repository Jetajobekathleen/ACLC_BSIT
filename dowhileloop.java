public class dowhileloop {
    public static void main(String[] args) {

        int order = 1;
        int walletBalance = 500;
        int completed = 0;
        int canceled = 0;

        String result;

        System.out.println(" Food Delivery Shift ");
        System.out.println("Starting Wallet Balance: ₱" + walletBalance);

        do {
            System.out.println("\nDelivery Order #" + order);

            if (order == 1) {
                result = "Delivered";
            } else if (order == 2) {
                result = "Delivered";
            } else if (order == 3) {
                result = "Canceled";
            } else if (order == 4) {
                result = "Delivered";
            } else {
                result = "Canceled";
            }

            System.out.println("Order Status: " + result);

            if (result.equals("Delivered")) {
                walletBalance += 150;
                completed++;
                System.out.println("You earned ₱150!");
            } else {
                walletBalance -= 50;
                canceled++;
                System.out.println("Order failed! Lost ₱50 for gas.");
            }

            System.out.println("Current Wallet Balance: ₱" + walletBalance);

            order++;

        } while (order <= 5);

        System.out.println("\n--- SHIFT SUMMARY ---");
        System.out.println("Orders Attempted: " + (order - 1));
        System.out.println("Successful Deliveries: " + completed);
        System.out.println("Canceled Orders: " + canceled);
        System.out.println("Final Wallet Balance: ₱" + walletBalance);

        if (walletBalance >= 800) {
            System.out.println("Sarap sa pakiramdam, nakatarget din!");
        } else {
            System.out.println("Kulang pa sa pamasahe at kain, overtime bukas.");
        }

        System.out.println("Uwi na muna.");
    }
}
