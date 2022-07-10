import java.util.Scanner;
public class PrintArr {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of an Array : ");
        int n = s.nextInt();
        int [] arr;
        arr = new int[n];

        System.out.println("Enter "+n+" numbers of an Array : ");
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("EYour Array is : ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        s.close();
    }
}
