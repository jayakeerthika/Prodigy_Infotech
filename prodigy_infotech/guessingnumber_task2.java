import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1; // 1 to 100
        int guess = 0;
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100");

        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > targetNumber) {
                System.out.println("Too High!");
            }
            else if (guess < targetNumber) {
                System.out.println("Too Low!");
            }
            else {
                System.out.println("Congratulations!");
                System.out.println("You guessed correctly.");
                System.out.println("Attempts: " + attempts);
            }
        }

        sc.close();
    }
}
