
public class Phone {
	
	// Attributes
	
	private String name; // 1
	private int noOfDisplayPixels; // 2
	private float width; // 3
	private float height; // 4
	private float weight; // 5
	private boolean isPoweredOn; // 6
	private boolean isRecharging; // 7
	
	// Constructor	
	
	public Phone(String name, int noOfDisplayPixels, float width, float height,
			float weight, boolean poweredOn, boolean recharging) {
		super();
		this.name = name;
		this.noOfDisplayPixels = noOfDisplayPixels;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.isPoweredOn = poweredOn;
		this.isRecharging = recharging;
	}
	
	// Accessor Methods
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public int getNoOfDisplayPixels() {
		return noOfDisplayPixels;
	}

	public void setNoOfDisplayPixels(int noOfDisplayPixels) {
		this.noOfDisplayPixels = noOfDisplayPixels;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public boolean isPoweredOn() {
		return isPoweredOn;
	}

	public void setPoweredOn(boolean poweredOn) {
		this.isPoweredOn = poweredOn;
	}
	
	public boolean isRecharging(){
		return isRecharging;
	}
	
	public void setRecharging(boolean recharging){
		this.isRecharging = recharging;
	}

	public String toString(){		
		return "Name: " + name + "\n" + 
		       "No of Display Pixels: " + noOfDisplayPixels + "\n" +
		       "Width: " + width + "\n" +
		       "Height: " + height + "\n" +
		       "Weight: " + weight + "\n" +
		       "Powered On?: " + isPoweredOn+ "\n" +
		       "Recharging?: " + isRecharging + "\n";		
	}// method
	
}// class
