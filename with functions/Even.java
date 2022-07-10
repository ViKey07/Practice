import java.util.*;
public class Even {
    public static boolean checkEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(checkEven(n));
        s.close();
    }
}
