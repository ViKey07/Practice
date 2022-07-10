import java.util.Scanner;
public class Factorial {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number which Factorial has to be Calculated : ");
        int n = s.nextInt();
        s.close();
        int fact=1;

        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of " +n+ " is : "+ fact);
    }
}
