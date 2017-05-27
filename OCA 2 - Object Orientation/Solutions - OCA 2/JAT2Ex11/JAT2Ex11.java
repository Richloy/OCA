public class JAT2Ex11{
   static int a;
   final static int b;
   int c;
   final int d;

   public JAT2Ex11(){
     System.out.println("In Constructor");
	 System.out.println("a's value is: " + a);
	 System.out.println("b's value is: " + b);
	 System.out.println("c's value is: " + c);
	 System.out.println("d's value is: " + d);
   }
   
   public static void main(String[] args){
     new JAT2Ex11();
	 System.out.println("**************************");
	 new JAT2Ex11();
   }

   static{
    a=1;
	System.out.println("In static initialiser (1)");
   }
   
   {
    c=3;
	System.out.println("In instance init block (1)");
   }
   
   static{
    b=2;
	System.out.println("In static initialiser (2)");
   }
   
   {
    d=4;
	System.out.println("In instance init block (2)");
   }
}