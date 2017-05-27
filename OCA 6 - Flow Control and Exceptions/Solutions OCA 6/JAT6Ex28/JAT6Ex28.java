import java.io.EOFException;

public class JAT6Ex28{

	public void e() throws EOFException{
		// throw an exception
		throw new EOFException();
	}// method
	
	public void d() throws EOFException{
	  e();	
	}// method
	
	public void c() throws EOFException{
	  d();
	}// method
	
	public void b() throws EOFException{
	  c();	
	}// method
	
	public void a(){
		try{
	      b();
		}catch(EOFException e){
		  System.out.println("Method a() has caught an EOFException which originated in method e().");
		}
	}// method
	
    public static void main(String[] args) {
	  new JAT6Ex28().a();	
	}// main	

}// class
