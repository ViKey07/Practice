import java.util.Scanner;
public class Tables {
    public static void tab(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    } 
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter th number");
        int num = scn.nextInt();
        
        tab(num);
        scn.close();
    }
}
