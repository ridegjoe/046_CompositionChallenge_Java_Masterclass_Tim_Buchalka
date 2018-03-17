package eu.rideg;

public class LivingRoom {
    // Composition of LivingRoom based on classes of furniture, television and fenestration
    private Furniture theFurniture;
    private Television theTelevision;
    private Fenestration theFenestration;
    private Light theLight;
    private Dimensions dimensions;

    // Creating construction for accepting the three objects
    public LivingRoom(Furniture theFurniture, Television theTelevision, Fenestration theFenestration, Light theLight, Dimensions dimensions) {
        this.theFurniture = theFurniture;
        this.theTelevision = theTelevision;
        this.theFenestration = theFenestration;
        this.theLight = theLight;
        this.dimensions = dimensions;
    }

    public void switchTheLightOfLivingRoom(boolean newStatusOfLightInLivingRoom) {
        if (newStatusOfLightInLivingRoom==true) {
            theLight.switchLightOn(true);
        } else {
            theLight.switchLightOn(false);
        }

    }


    public Furniture getTheFurniture() {
        return theFurniture;
    }

    public Television getTheTelevision() {
        return theTelevision;
    }

    public Fenestration getTheFenestration() {
        return theFenestration;
    }


    public Dimensions getDimensions() {
        return dimensions;
    }
}

