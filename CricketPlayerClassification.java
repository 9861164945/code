import java.util.Scanner;

class CricketPlayerClassification {
    public static void main(String[] args) {
        int runs, wkts;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the player's name: ");
        String name = scanner.nextLine(); // Read the player's name as a string
        
        System.out.println("Enter the number of runs: ");
        runs = scanner.nextInt();
        
        System.out.println("Enter the number of wickets: ");
        wkts = scanner.nextInt();
        
        if (runs >= 300 && wkts > 80)
         {
            System.out.println(name + " is an all-rounder");
        }
        
        else if (runs >= 300)
         {
            System.out.println(name + " is a batsman");
        } 
        else if (wkts>20) 
        {
            System.out.println(name + " is a bowler");
        } 
        else
         {
            System.out.println(name + "is  not only a bowler/batsman but also an allrounder:");
        }
    }
}