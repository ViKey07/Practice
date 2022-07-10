import java.util.*;
public class Decimal {
    public static int binaryToDecimal(String binary){
        int n = binary.length();

        int curr_pow = 1;
        int decimal = 0;

        for(int i=n-1; i>=0; i--){
            char ch = binary.charAt(i);

            if(ch=='1'){
                decimal = decimal+curr_pow;
            }
            curr_pow = curr_pow*2;
        }
        return decimal;
    }

    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number which you want to convert in Decimal : ");
        String binary = s.nextLine();

        int decimal = binaryToDecimal(binary);

        System.out.print("The Decimal number of "+binary+" is "+decimal);

        s.close();
    }
}
