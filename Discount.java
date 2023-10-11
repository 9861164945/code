import java .util.*;
class Discount{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in)
;
        double amt,price,qty,disc;
        System.out.println("enter quantity :");
        qty=sc.nextDouble();
        System.out.println("Enter price:");
        price=sc.nextDouble();
        amt=qty*price;
        if(amt > 5000){
            disc=amt*0.10;

        }
        else if(amt > 1000){
            disc=amt*0.05;
        }
        else{
            disc=0;

        }
        amt=amt-disc;
        System.out.println(amt);


        }
}