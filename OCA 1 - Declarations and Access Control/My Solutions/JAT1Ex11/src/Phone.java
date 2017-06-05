public class Phone {
    
    private String name;
    private int noOfDisplayPixels;
    private float width;
    private float height;
    private float weight;
    private boolean isPoweredOn;
    private boolean isRecharging;
    
    public Phone(String n, int no,float w, float h, float we, boolean isp, boolean isc) {

        this.name = n;
        this.noOfDisplayPixels = no;
        this.width = w;
        this.height = h;
        this.weight = we;
        this.isPoweredOn = isp;
        this.isRecharging = isc;
    }

    public String getName() {
        return name;
    }

    public int getNoOfDisplayPixels() {
        return noOfDisplayPixels;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public boolean getIsPoweredOn() {
        return isPoweredOn;
    }

    public boolean getIsCharging() {
        return isRecharging;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNoOfDisplayPixels(int noOfDisplayPixels) {
        this.noOfDisplayPixels = noOfDisplayPixels;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setIsPoweredOn(boolean isPoweredOn) {
        this.isPoweredOn = isPoweredOn;
    }

    public void setIsRecharging(boolean isRecharging) {
        this.isRecharging = isRecharging;
    }
    
    @Override
    public String toString(){
        return "Name: \t" + name +
                "\nNo of Pixels: " + noOfDisplayPixels +
                "\nWidth:\t" + width + 
                "\nHeight:\t" + height +
                "\nWeight:\t" + weight +
                "\nIs Charging:\t" + isRecharging +
                "\nIs Powered On:\t" + isPoweredOn;
    }
    
}
