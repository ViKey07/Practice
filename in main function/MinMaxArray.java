
import java.util.Scanner;
public class MinMaxArray {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr;
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        
        System.out.println("Maximum value: "+max);
        System.out.println("Minimum value: "+min);
        s.close();
    }
    
}
