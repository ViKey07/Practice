import java.util.Scanner;
public class Fact {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = s.nextInt();
        s.close();
        int fact = 1;

        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println("Factorial is : "+fact);
    }
    
}
