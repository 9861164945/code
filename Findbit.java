import java.util.*;
class Findbit{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter an integer:");
        int num=sc.nextInt();
        int i=1;
        int bitvlue=FindBit(num,i);
        System.out.println("The "+i+"th bit of"+num+"is"+bitvlue);
    }
    static int FindBit(int num,int i){
        return(num&(1<<i))==0?0:1;
        
    }
}