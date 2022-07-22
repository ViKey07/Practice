import java.util.*;

public class Arraylist 
{
    
    public static void main(String []args) 
    {
        ArrayList<Integer> list1 = new ArrayList<>();


        //Add Elements
        list1.add(0);
        list1.add(2);
        list1.add(3);
        
        System.out.println(list1);

        
        
        //Get Element
        int element = list1.get(0);
        System.out.println(element);



        //Add Element in Between
        list1.add(1, 1);
        System.out.println(list1);



        //Set Element
        list1.set(0, 5);
        System.out.println(list1);



        //Delete Element
        list1.remove(3);
        System.out.println(list1);



        //Size
        int size = list1.size();
        System.out.println(size);



        //loops
        for(int i=0; i<list1.size(); i++)
        {
            System.out.print(list1.get(i));
        }
        System.out.println();



        //Sorting
        Collections.sort(list1);
        System.out.print(list1);
    }   
}
