package eu.rideg;

public class Fenestration {

    // Fields
    public int numberOfWindows;
    public int numberOfDoors;

    // Constructor for initializing fields
    public Fenestration(int numberOfWindows, int numberOfDoors) {
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
    }

    // Getters for fields
    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
