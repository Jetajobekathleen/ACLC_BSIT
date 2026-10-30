public class forloop {
    public static void main(String[] args) {
        
        int totalPushups = 0;
        int targetGoal = 150;

        System.out.println("==================================");
        System.out.println("   WEEKLY FITNESS PUSH-UP TRACKER   ");
        System.out.println("==================================");

        
        for (int day = 1; day <= 7; day++) {
            System.out.println("\nDay " + day + " Workout:");
            
            int dailyReps = 0;
            
            
            for (int set = 1; set <= 5; set++) {
                int repsPerSet = 5;
                dailyReps += repsPerSet;
            }

            totalPushups += dailyReps;
            System.out.println("Completed today: " + dailyReps + " push-ups");
            System.out.println("Running Total: " + totalPushups + " push-ups");
            System.out.println("----------------------------------");
        }

        System.out.println("\n=== FINAL WEEKLY SUMMARY ===");
        System.out.println("Total Push-ups Completed: " + totalPushups);
        System.out.println("Weekly Target: " + targetGoal);

        if (totalPushups >= targetGoal) {
            System.out.println("Sipag mo naman, abot-kamay ang abs!");
        } else {
            System.out.println("Kulang pa saensayo, bawi next week.");
        }
        
        System.out.println("Rest day na!");
    }
}
