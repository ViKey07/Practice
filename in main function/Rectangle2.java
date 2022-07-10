
class Rectangle2
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
    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);

    R.accept(a,b);
    R.display();
    R.area();
   }
}
