import java.util.Scanner;
public class Pattern7 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int space = n-1;
        int star = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");

            }
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            star++;
            space--;
            System.out.println();
        }
        s.close();
    }
}
