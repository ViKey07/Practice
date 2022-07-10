import java.util.Scanner;
public class OddEven {
    public static void main(String [] args){
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int n = scn.nextInt();
        scn.close();
        if(n%2==0){
            System.out.println("Number is Even. ");
        }else{
            System.out.println("Number is Odd. ");
        }
    }
}
