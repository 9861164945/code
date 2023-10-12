import java.util.Scanner;

public class ConvertionLetter  {
    public static void main(String[] args) {
        char inputChar;
        char convertedChar;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        inputChar = scanner.next().charAt(0);

        if (Character.isUpperCase(inputChar)) {
            convertedChar = Character.toLowerCase(inputChar);
            System.out.printf("Lowercase of %c is %c", inputChar, convertedChar);
        } else if (Character.isLowerCase(inputChar)) {
            convertedChar = Character.toUpperCase(inputChar);
            System.out.printf("Uppercase of %c is %c", inputChar, convertedChar);
        } else {
            System.out.println("Invalid input. Please enter an uppercase or lowercase letter.");
        }
}
    
}