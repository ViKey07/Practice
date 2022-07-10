import java.util.Scanner;
public class Facto {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+n+" is : "+fact);
    }
}
