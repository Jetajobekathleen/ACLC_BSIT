public class Main {
    public static void main(String[] args) {

        int question = 1;

        do {
            System.out.println("Question number: " + question);

            if (question == 1) {
                System.out.println("What is your name?");
            } 
            else if (question == 2) {
                System.out.println("How old are you?");
            } 
            else {
                System.out.println("What is your favorite subject?");
            }

            question++;

        } while (question <= 3);

        System.out.println("Thank you");
    }
}