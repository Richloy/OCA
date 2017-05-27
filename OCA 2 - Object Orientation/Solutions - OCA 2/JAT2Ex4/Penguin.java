
public class Penguin extends Animal {

    public Penguin(String name, int age, boolean isHungry) {
		super(name, age, isHungry);
	}

	@Override
	public String feed() {
		return "Penguin " + super.getName() + " is being fed. He eats fish from a bucket.";
	}

	@Override
	public String performTrick() {
		//System.out.println("Hello P");
		return "Penguin " + super.getName() + " flaps wings";
	}	

 }// class
