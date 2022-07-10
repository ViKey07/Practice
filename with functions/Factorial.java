import java.util.*;
public class Factorial {
    public static int calFactorial(int n){
        int fact = 1;
        for(int i=n; i>=1; i--){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(calFactorial(n));
    }
}
