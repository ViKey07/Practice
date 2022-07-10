/*WAP to do Sum of Array Elements. */
import java.util.Scanner;

public class SumArray {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr; 
        arr = new int[n];
        int num, sum=0;
        
        //Accepting Elements of Array from user.
        System.out.println("Enter Elements of an Array :");
        for(int i=0; i<n; i++){
            num = scn.nextInt();
            arr[i] = num;
        }

        //Displaying Sum of an Array.
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of Array Elements is :"+" "+sum);
        scn.close();
    }
}
