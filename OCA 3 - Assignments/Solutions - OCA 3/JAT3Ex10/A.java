public class A{
  A a;

 public static void main(String[] args){
  A a2 = new A();
  A a3 = new A();
  A a4 = new A();
  
  a2.a = a3;
  a3.a = a4;
  a4.a = a2;
  
  a2 = null; 
  a3 = null; 
  a4 = null; 
 } 
 
 // Carry on processing.
}

/*
An example of 'islands of isolation'.

Although, the object reference variables a2, a3 and a4 contain instance variables with references to each other.
there links to the outside world have been nulled. 

As per Sierra Bates, 'If all other references to these two objects are removed, then even though each object
still has a valid reference, there will be no way for any live thread to access either object.'

The garbage collector can usually discover such islands of isolation.

*/