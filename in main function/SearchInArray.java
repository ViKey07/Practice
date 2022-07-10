import java.util.Scanner;
public class SearchInArray {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[];
        arr = new int[n];

        int num;
        System.out.println("Enter Elements of Array : ");
        for(int i=0; i<n; i++){
            num = scn.nextInt();
            arr[i] = num;
        }
        
        int flag=0, i;
        System.out.println("Enter the Element you want to find : ");
        int x = scn.nextInt();
        scn.close();
        for(i=0; i<n; i++){
            if(arr[i] == x){
                flag = 1;
                break;
            }else{
                flag=0;
            }
        }
        if(flag == 1){
            System.out.println("Your number is found on position : "+i);
        }else{
            System.out.println("Element not found.");
        }
    } 
}
