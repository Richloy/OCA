public class Parent{
  static byte a;
  private byte b;
  
  public Parent(){
   System.out.println("In Parent constructor.");
   a = 5;
   b = 2;
  }
  
  {
   b = 1;
   System.out.println("In instance init block - Parent");
  }
  
  static{
   a = 2;
   System.out.println("In static initialiser block - Parent");
  }
  
  public byte getB(){
   return b;
  }
}