import java.util.Scanner;

public class Numbertoword {
    public static void main(String[] args) {
        int n, num = 0;
        System.out.println("enter any number to print in words:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        while (n != 0) {
            num = (num * 10) + (n % 10);
            n /= 10;
        }
        while (num != 0) {
            switch (num % 10) {
                case 0:
                    System.out.print("zero\t");
                    break;
                case 1:
                    System.out.print("one\t");
                    break;
                case 2:
                    System.out.print("two\t");
                    break;
                case 3:
                    System.out.print("three\t");
                    break;
                case 4:
                    System.out.print("four\t");
                    break;
                case 5:
                    System.out.print("five\t");
                    break;
                case 6:
                    System.out.print("six\t");
                    break;
                case 7:
                    System.out.print("seven\t");
                    break;
                case 8:
                    System.out.print("eight\t");
                    break;
                case 9:
                    System.out.print("nine\t");
                    break;
            }
            num = num / 10;
        }
    }
}