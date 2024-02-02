import java.util.Scanner;
import java.util.Random;

public class NumberGuess {

    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber() {
        Random rand = new Random();
        var secretNumber = rand.nextInt(100) + 1;
        var attempts = 0;
        var input = new Scanner(System.in);

        System.out.println("Welcome to Number Guessing Game::");
        System.out.println("I have chosen a number between 1 and 100. Can you guess it?");

        while (true) {
            System.out.print("Enter your guess: ");
            var guess = input.nextInt();
            attempts++;

            if (guess < secretNumber)
                System.out.println("Too low! Try again.");
            else if (guess > secretNumber)
                System.out.println("Too high! Try again.");
            else {
                System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly in " + attempts + " attempts.");
                break;
            }
        }

        input.close();
    }
}

