import java.util.ArrayList;

public class JAT5Ex19{
  public static void main(String[] args){
	ArrayList list = new ArrayList(); // Objects of class Object or derived classes can be stored.
    list.add(12); // The primitive value is upcast to an Integer wrapper object.
	list.add((byte) 13); // The primitive value is upcast to a Byte Wrapper object.
	list.add(14L); // The primitive value is upcast to a Long Wrapper object.
    list.add(new Cat("Snowball"));	// Class Cat extends Object
	
	for(Object o:list){
      System.out.println(o);
    }	
 }// main
}// class

class Cat{
 String name;
 public Cat(String name){
  this.name = name;
 }
 @Override
 public String toString(){
  return name;
 }
}


