import java.util.Scanner;
public class Student {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks of Hindi : ");
        int a = s.nextInt();
        System.out.println("Enter marks of Marathi : ");
        int b = s.nextInt();
        System.out.println("Enter marks of English : ");
        int c = s.nextInt();
        s.close();
        int total=0;
        int avg = 0;

        total = a+b+c;
        avg = ((a+b+c)/3);

        System.out.println("Total marks of Student is : "+total);
        System.out.println("Average marks of Student is : "+avg);
    }
}
