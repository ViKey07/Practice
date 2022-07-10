import java.util.Scanner;
public class CheckSort {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr;
        arr = new int[n];
        System.out.println("Enter Array Elements");
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int m=n;
        int flag=0;
        scn.close();

        for(int i=0; i<n; i++){
            if(arr[i-1] > arr[i]){
                flag=1;
                if(n>=m){
                    break;
                }
            }
        }

        if(flag==1){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is Not Sorted");
        }
    }
}
