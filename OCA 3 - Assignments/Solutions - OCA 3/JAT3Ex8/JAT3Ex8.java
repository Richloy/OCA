public class JAT3Ex8{  
  private byte b = 19;
  
  public static void main(String[] args){
   byte b = 13;
   JAT3Ex8 obj = new JAT3Ex8();
   obj.update(b);
   System.out.println(b); // 13. It is the value of the local variable (b) that is displayed.
  }	

  public void update(byte b){
   this.b++;
   b--;
  }
}
