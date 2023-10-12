import java.util.Scanner;
import java.util.Random;

public class Game{
    public static void main(String[] args) {
        int number, guess, nguesses = 1;
        Random rand = new Random();
        number = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("guess the number between 1 to 100");
            guess = scanner.nextInt();
            if (guess > number) {
                System.out.println("lower number please");
            } else if (guess < number) {
                System.out.println("higher number please");
            } else {
                System.out.println("you guessed it in " + nguesses + " attempts");
            }
            nguesses++;
        } while (guess != 0);
    }
}