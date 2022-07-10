import java.util.Scanner;
public class SelectionSort {

    public static void swap(int[] arr, int i, int j) {
        int temp=arr[i];

        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[];
        arr = new int[n];

        System.out.println("Enter the Array Elements : ");
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        scn.close();

        for(int i=0; i<n-1; i++){
            
            int min_idx = i;

            for(int j=i+1; j<n; j++){
                
                if(arr[j] < arr[min_idx]){
                    
                    min_idx = j;

                }
            }
            swap(arr, i, min_idx);
        }

        System.out.print("The Sorted Array is : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}