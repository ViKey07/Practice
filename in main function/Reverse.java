import java.util.*;
public class Reverse {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number to reverse :");
        int n=s.nextInt();
        s.close();
        int rem=0,rev=0;
        for(int i=n;i>0;i=i/10)
        {
            rem=i%10;
            rev=(rev*10)+rem;
        }
        System.out.println("Reverse = "+rev);
    }
}
