import java.util.Scanner;
public class LargestSmallest {
    public static void main(String [] args){
        Scanner scn  = new Scanner(System.in);
        System.out.println("Enter two Numbers : ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.close();
        int c = 0;

        c = (n>m)?n:m;

        System.out.println("Largest Number is : "+c);
    }
}
