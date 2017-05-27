
public abstract class Animal {

	// Attributes
	private String name;
	private int age;
	private boolean isHungry;
	
	// Constructors
	public Animal(String name, int age, boolean isHungry) {
		super();
		// Give the instance variables there values in one
		// centralised constructor.
		// Data Validation
		if(age<0){
			this.age = 0;
		}else{
			this.age = age;
		}
		
		this.name = name;
		this.isHungry = isHungry;
	}
	
	public Animal() {
		this("Unknown",0,false);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0){
			this.age = 0;
		}else{
			this.age = age;
		}
	}

	public boolean isHungry() {
		return isHungry;
	}

	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}
		
	// Behaviours:
	
    public abstract String feed();
    
    public abstract String performTrick();
	
	public String toString(){
		return "Name: " + name + "\n" + "Age: " + age +"\n" + "Is Hungry? " + isHungry;
	}
    	    
}// class
