import java.util.Scanner;

public class LargeSmall {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr;
        arr = new int[n];

        System.out.println("Enter Elements of an Array :");
        int num;
        for(int i=0; i<n; i++){
            num = scn.nextInt();
            arr[i] = num;
        }

        int large = arr[0];
        int small = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > large){
                large = arr[i];
            }if(arr[i] < small){
                small = arr[i];
            }
        }
        System.out.println("Largest Number of Array is : "+large);
        System.out.println("Smallest Number of Array is : "+small);
        scn.close();
    }
}
