package eu.rideg;

public class Furniture {
    // Creating fields for pieces of furniture
    private int numberOfTables;
    private int numberOfChairs;
    private int numberOfCouches;

    // Creating constructor for initializing fields
    public Furniture(int numberOfTables, int numberOfChairs, int numberOfCouches) {
        this.numberOfTables = numberOfTables;
        this.numberOfChairs = numberOfChairs;
        this.numberOfCouches = numberOfCouches;
    }

    // Creating getters for number of different pieces of furniture
    // These fields are set to public. They can be reached via getters below
    // Alternative solution could be defining a method/function here, and calling that method
    // while deleting getters and keeping the fields themselves private.
    public int getNumberOfTables() {
        return numberOfTables;
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    public int getNumberOfCouches() {
        return numberOfCouches;
    }
}
