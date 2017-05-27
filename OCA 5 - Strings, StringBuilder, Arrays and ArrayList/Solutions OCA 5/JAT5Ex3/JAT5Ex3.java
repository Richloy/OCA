public class JAT5Ex3{
  public static void main(String[] args){
    String name = "Java Duke";
	String java = name;
	String icon = new String("Duke");
	String bean = icon;
	name.toUpperCase();
	icon.toUpperCase();
	name = icon.substring(2); 
	icon = bean.substring(1); 
	
	System.out.println(name);
	System.out.println(java); 
	System.out.println(icon); 
	System.out.println(bean); 
 }
}