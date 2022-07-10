import java.util.*;
public class PrintAlt {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int [] arr;
        arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Printing Alternate Elements of array with their indexes : ");
        for(int i=0; i<n; i=i+2){
            System.out.println(arr[i]+" is present at index "+ i);
        }
        s.close();
    }
}
