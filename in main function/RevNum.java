import java.util.Scanner;
public class RevNum {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number to be Reversed : ");
        int n = s.nextInt();
        s.close();
        int rem=0, rev=0;
        for(int i=n; i>0; i=i/10){
            rem = i%10;
            rev = (rev*10)+rem;
        }
        System.out.println("Reversed : "+rev);
    }
}
