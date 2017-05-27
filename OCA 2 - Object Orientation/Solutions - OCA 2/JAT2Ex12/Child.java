public class Child extends Parent{
  static byte c;
  private byte d;
  
  public Child(){
   System.out.println("In Child constructor.");
   c = 10;
   d = 20;
  }
  
  {
   c = 1;
   System.out.println("In instance init block - Child");
  }
  
  static{
   c = 17;
   System.out.println("In static initialiser block - Child");
  }
  
  public byte getD(){
   return d;
  }
}