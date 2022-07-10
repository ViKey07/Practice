import java.util.*;
public class Stud {
    String first_name;
    String middle_name;
    String last_name;
    void accept(String fn, String mn, String ln){
        first_name = fn;
        middle_name = mn;
        last_name = ln;
    }
    
    void fullname(){
        System.out.println(first_name+" "+middle_name+" "+last_name);
    }

    public static void main(String [] args){
        Stud v = new Stud();
        
        Scanner scn = new Scanner(System.in);
        String frst = scn.nextLine();
        String scnd = scn.nextLine();
        String lst = scn.nextLine();
        System.out.println("Enter scond name ");
        String frs = scn.nextLine();
        String sc = scn.nextLine();
        String ls = scn.nextLine();

        v.accept(frst, scnd, lst);
        v.fullname();

        Stud h = new Stud();
        h.accept(frs,sc,ls);
        h.last_name="Coolkarni";
        h.fullname();
    }
}
