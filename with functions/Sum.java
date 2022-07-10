import java.util.*;
class Sum{
    public static int calSum(int a, int b){
       int sum = a+b;
       return sum;
    }

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        //System.out.print("Sum is : "+calSum(n, m));
        int ans = calSum(n, m);
        System.out.print(ans);
    }
}