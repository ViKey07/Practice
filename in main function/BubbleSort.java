import java.util.Scanner;

public class BubbleSort {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[];
        arr = new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        scn.close();

        for(int i=0; i<n-1; i++){

            for(int idx=0; idx<n-1-i; idx++){
                if(arr[idx] > arr[idx+1]){
                    int temp = arr[idx];
                    arr[idx] = arr[idx+1];
                    arr[idx+1] = temp;
                }
            }
        }
        System.out.print("Sorted Array is : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}