public class whileloop {
    public static void main(String[] args) {

        System.out.println("MOBILE LOAD ALLOWANCE TRACKER");
        System.out.println("==================================");

        int loadBalance = 200;
        System.out.println("Starting Load Balance: ₱" + loadBalance);

      
        int[] dailyExpenses = {50, 40, 60, 50};

        for (int i = 0; i < dailyExpenses.length; i++) {
            int day = i + 1;
            int expense = dailyExpenses[i];

            System.out.println("\nDay " + day);
            System.out.println("Load Expense: ₱" + expense);

            if (expense > loadBalance) {
                System.out.println("Not enough load!");
                break;
            }

            loadBalance = loadBalance - expense;
            System.out.println("Remaining Balance: ₱" + loadBalance);
        }

        System.out.println("\n==================================");
        System.out.println("YOUR LOAD IS ALL GONE / TAPOS NA ANG BUDGET");
    }
}
