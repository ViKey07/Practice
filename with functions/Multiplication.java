import java.util.*;
public class Multiplication {
    public static void calProduct(int a, int b){
        int product = a*b;
        //return product;
        System.out.print(product);
    }

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        //System.out.print(calProduct(a, b));
        calProduct(a, b);

    }
}
