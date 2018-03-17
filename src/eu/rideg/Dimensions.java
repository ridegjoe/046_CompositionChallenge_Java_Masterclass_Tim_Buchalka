package eu.rideg;

public class Dimensions {
    // Definition of the fields for "Dimensions" of a room.
    private double width;
    private double height;
    private double depth;

    // Constructor for initializing the fields for "Dimensions"
    public Dimensions(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method for calculating the area
    public void calculateArea() {
        System.out.printf("Width is " + this.width + " ,depth is :" + this.depth +"\n");
        System.out.println("Calculated area is: " + (this.width*this.depth) +"\n");
    }

    // Getters for the fields of "Dimensions"
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

}

