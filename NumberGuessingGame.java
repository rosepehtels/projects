import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int numberOfTries = 0;
        int guess;
        boolean hasGuessedCorrectly = false;

        while(!hasGuessedCorrectly) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < 1 || guess > 100) {
                System.out.println("Invalid guess. Please guess a number between 1 and 100.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high. Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Correct! You guessed the number in " + numberOfTries + " tries.");
            }
        }

        // Closing the scanner
        scanner.close();
    }
}
