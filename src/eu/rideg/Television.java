package eu.rideg;

public class Television {
    // Definition of fields
    private String model;
    private String manufacturer;
    private Resolution nativeResolution;
    private String screenType; // LCD or LED
    private boolean isON; // Is the television switched on or off
    private int volumeOfSound; // Percentage of sound volume between 0 and 100%

    // Constructor for initialization of the fields
    public Television(String model, String manufacturer, Resolution nativeResolution, String screenType, boolean isON, int volumeOfSound) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.nativeResolution = nativeResolution;
        this.screenType = screenType;
        this.isON = isON;
        this.volumeOfSound = volumeOfSound;
    }

    // Method for switching television on
    public void switchTelevision (boolean switchTelevisionOn) {
        System.out.println("switchTelevision() method from television class was called");
        if (switchTelevisionOn == isON) {
            System.out.println("Television is already ON: " + isON);
        } else {
            System.out.println("Original status of television is " + isON);
            isON = switchTelevisionOn;
            System.out.println("Updated status of television is " + isON);
        }
    }

    // Method for increasing/decreasing volume
    public void increaseVolume (int rate) {
        if (this.isON== false) {
            System.out.println("Television is OFF. Switch it ON first");

        }
        else {
            if ((volumeOfSound + rate) > 100) {
                System.out.println("Original volume was " + this.volumeOfSound +" . Rate is " +rate);
                this.volumeOfSound = 100;
                System.out.println("New volume is set to maximum value of " + this.volumeOfSound);
            } else if ((volumeOfSound + rate) < 0) {
                System.out.println("Original volume was " + this.volumeOfSound +" . Rate is " +rate);
                this.volumeOfSound = 0;
                System.out.println("New volume is set to minimum value of " + this.volumeOfSound);
            } else  {
                System.out.println("Original volume was " + this.volumeOfSound +" . Rate is " +rate);
                this.volumeOfSound += rate;
                System.out.println("New volume is set to " + this.volumeOfSound);

            }
        }

    }

    public void screenTypeValidityCheck() {
        System.out.println("The type of screen with original cases is: " +this.screenType);
        if ((screenType.equalsIgnoreCase("LCD")) || (screenType.equalsIgnoreCase("LED"))) {
            System.out.println("The type of screen is valid. OK.");
        }   else {
            System.out.println("The type of screen is NOT valid. Please check it!");
        }
    }
}
