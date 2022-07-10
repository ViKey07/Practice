import java.util.Scanner;
public class Pattern8 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int space = 1;
        int star = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");

            }
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            star--;
            space++;
            System.out.println();
        }
        s.close();
    }
}
