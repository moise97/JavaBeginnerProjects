import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int userGuess = 0;
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = reader.nextInt();
            if (userGuess < numberToGuess) {
                System.out.println("Too low!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You win !");
            }

        }
        reader.close();
    }

}