import java.util.*;
class Rectangle 
{
   int ln,wd;
   
   void accept(int l, int w)
   {
    ln=l;
    wd=w;
   }
   void display()
   {
    System.out.println("Length= "+ln);
    System.out.println("Width= "+wd);
   }
   void area()
   {
    int area=ln*wd;
    System.out.println("AREA = "+area);
   }
   public static void main(String []args)
   {
    Rectangle R=new Rectangle();
    Scanner s=new Scanner(System.in);
    System.out.println("Eneter length and width=");
    int a=s.nextInt();
    int b=s.nextInt();

    R.accept(a,b);
    R.display();
    R.area();
   }
}
