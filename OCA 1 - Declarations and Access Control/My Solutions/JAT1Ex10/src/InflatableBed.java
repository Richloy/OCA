public class InflatableBed implements Deflatable, Inflatable {
    
    float airAdded = 0;
    
    @Override
    public void deflate() {
        do {
            System.out.println("Deflating Inflatable Bed...." + airAdded + "% air pressure.");
            if(airAdded == minSetting){
                System.out.println("Inflatable Bed is deflated fully");
            }
            airAdded -= deflateFactor;
        } while(airAdded >= minSetting);
        
    }

    @Override
    public void inflate() {
        
        do {
            System.out.println("Inflating Inflatable Bed...." + airAdded + "% air pressure.");
            if(airAdded == maxSetting){
                System.out.println("Inflatable Bed is inflated fully");
            }
            airAdded += inflateFactor;
        } while(airAdded <= maxSetting);
    }
    
}
