import java.util.*;
class  Love{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name:");
        String myName=sc.next();
        System.out.println("Enter your lovers Name:");
        String loverName=sc.next();
        int percentage=(int)(Math.random()*100)+1;
        System.out.println("Your Lover:" +loverName+ " " +percentage+"% loves "+"to:"+myName);
   
    }
}