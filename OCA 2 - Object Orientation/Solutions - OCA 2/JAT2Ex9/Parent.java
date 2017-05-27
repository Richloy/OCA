public class Parent{
  String name = "name not set";

  public Parent (String s){
   this.name=s;
  }
  
  public void setName(String s){
   this.name=s;
  }
  
  public String getName(){
   return name;
  }
}