import java.util.Scanner;
public class IsPall {
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
        if(rev==n){
            System.out.println(n+" is Pallindrome.");
        }else{
            System.out.println("Not a Pallindrome.");
        }
    }
}
