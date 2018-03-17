package eu.rideg;

public class Light {
    // Definition of field for light status
    private boolean isLightOn;

    // Constructor for status of light
    public Light(boolean isLightOn) {
        this.isLightOn = isLightOn;
    }

    public void switchLightOn (boolean newStatusOfLight) {
        System.out.println("switchLightOn() method was called.");
        if (newStatusOfLight == this.isLightOn) {
            System.out.printf("The light was ON: " + this.isLightOn + "\n");
            System.out.printf("The light should be ON: " + newStatusOfLight + "\n");
            System.out.printf("There is no action needed" + "\n");
        }   else {
            System.out.printf("The light was ON: " + this.isLightOn + "\n");
            System.out.printf("The light should be ON: " + newStatusOfLight + "\n");
            this.isLightOn = newStatusOfLight;
            System.out.printf("New status of the light (ON): " + this.isLightOn + "\n");
        }
    }

}
