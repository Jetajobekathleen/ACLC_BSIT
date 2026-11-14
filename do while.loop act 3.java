import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;
        
        do {
            System.out.println("🎮 Game is running...");
            System.out.print("Play again? (yes/no): ");
            answer = input.next();
            
        } while (answer.equalsIgnoreCase("yes"));
        
        System.out.println("Game ended!");
        input.close();
    }
}
