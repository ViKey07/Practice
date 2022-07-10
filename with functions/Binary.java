import java.util.*;

public class Binary {
    public static String decimalToBinary(int n){
        
        String binary="";
        
        while(n>0){
            
            int rem = n%2;
            
            binary = rem+binary;
           
            n = n/2;
        }
        return binary;
    }    
    
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to Convert into Binary : ");
        int n = s.nextInt();

        String binary = decimalToBinary(n);
        System.out.print(binary);
        s.close();
    }
    
}
