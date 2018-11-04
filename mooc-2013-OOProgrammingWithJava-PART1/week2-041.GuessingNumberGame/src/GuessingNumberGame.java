
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int userGuess = 0;
        int i = 0;
        // program your solution here. Do not touch the above lines!

        while (numberDrawn != userGuess) {
            userGuess = Integer.parseInt(reader.nextLine());
            i++;
            if (userGuess < numberDrawn) {
                System.out.println("The number is greater, guesses made: "+i);
            } else if (userGuess > numberDrawn) {
                System.out.println("The number is lesser, guesses made: "+i);
            } else if (userGuess == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");

            }
        }

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
