import java.util.*;
public class Searching {
    public static int binarySearch(int []arr, int tar){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==tar){
                return mid;
            } else if(arr[mid]<tar){
                left=mid+1;
            } else {
                right=mid-1;
            }
        }

        return -1;
    }
    
    public static void main(String []args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Length of an Array : ");
        int n = scn.nextInt();
        int []arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter Target Value : ");
        int tar = scn.nextInt();
        
        System.out.println("Target Value found on index : "+binarySearch(arr, tar));
        scn.close();
    }
}
