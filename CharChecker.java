import java.util.*;

class CharChecker{
    static char smaller(char[] letter, char target) {
        int start = 0;
        int end = letter.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the middle index
            if (letter[mid] == target) {
                return letter[mid]; // Element found, return it
            } else if (letter[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return '0'; // Return some default value to indicate not found
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        char arr[] = new char[n]; // Fixed typo in the array initialization
        System.out.println("Enter characters into that array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0); // Read characters one by one
        }
        System.out.println("Enter a character to Search:");
        char target = sc.next().charAt(0); // Read the target character
        char ans = smaller(arr, target);
        if (ans == '0') {
            System.out.println("The element was not found.");
        } else {
            System.out.println("The element is found at index: " + ans);
        }
    }
}