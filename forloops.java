public class Main {
    public static void main(String[] args) {

        int total = 0;

        for (int student = 1; student <= 5; student++) {

            int grade = 70 + (student * 5);

            System.out.println("Student " + student + " Grade: " + grade);

            total = total + grade;
        }

        double average = total / 5.0;

        System.out.println("Total Grade: " + total);
        System.out.println("Average Grade: " + average);

        if (average >= 75) {
            System.out.println("The class passed!");
        } else {
            System.out.println("The class failed.");
        }
    }
}