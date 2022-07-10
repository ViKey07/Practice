/*WAP a program to declare an Array of size 5 and Display it. */
import java.util.Scanner;

public class UserArray {
    public static void main(String [] args){
        int[] arr; // declaration
        arr=new int[5]; // initialization
        int num;
        Scanner scn = new Scanner(System.in);
        
        //Accepting Elements of Array from user.
        System.out.println("Enter any 5 numbers of Array A :");

        for(int i=0; i<5; i++){
            
            num = scn.nextInt();
            arr[i] = num;
        }

        //Displaying Data of an Array.
        System.out.println("Your Array is :");

        for(int i=0; i<5; i++){
            System.out.println(arr[i]);
        }
        scn.close();
    }
}
