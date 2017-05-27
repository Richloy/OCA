
public class Elephant extends Animal {

    public Elephant(String name, int age, boolean isHungry) {
		super(name, age, isHungry);
	}

	@Override
	public String feed() {
		return "Elephant " + super.getName() + " is being fed, he eats hay.";
	}

	@Override
	public String performTrick() {
		//System.out.println("Hello E");
		return "Elephant " + super.getName() + " blows with his trunk!";
	}

 }// class
