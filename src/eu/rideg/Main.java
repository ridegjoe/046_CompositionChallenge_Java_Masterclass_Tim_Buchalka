package eu.rideg;

public class Main {

    public static void main(String[] args) {
        // TIM BUCHALKA'S JAVA MASTERCLASS CHALLENGE START
        //
        // This is a challenge, defined by Tim Buchalka
        // This comment part of the code is a part of his Complete Java Master Course from www.udemy.com:
        //
        // https://www.udemy.com/java-the-complete-java-developer-course/
        //
        // I share the challenge text with his permission.
        //
        // START OF CHALLENGE FOR COMPOSITION
        //
        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.
        //
        // END OF CHALLENGE FOR COMPOSITION
        //
        // The code with the solution is made by myself.


        // First the base objects should be defined, from which we compose the LivingRoom object
        // Create furniture
        Furniture theFurniture = new Furniture(4,1,1);
        // Create Television
        Television theTelevision = new Television("QN88Q9FAMFXZA ","Samsung", new Resolution(3840,2160),"lcd", false, 0);
        // Create Fenestration
        Fenestration theFenestration = new Fenestration(3,2);
        // Create Light
        Light theLight = new Light(false);
        // Create Dimensions
        Dimensions theDimensions = new Dimensions(5,3,8);

        // Creating a new "LivingRoom" object called "theLivingRoom"
        LivingRoom theLivingRoom = new LivingRoom(theFurniture, theTelevision, theFenestration, theLight, theDimensions);


        // The following methods should be tested:
        // switchLightOn() (in Light class)
        // switchTheLightOfLivingRoom is used for reaching the method of switchLightOn, without getters!
        theLivingRoom.switchTheLightOfLivingRoom(true);
        theLivingRoom.switchTheLightOfLivingRoom(true);
        theLivingRoom.switchTheLightOfLivingRoom(false);
        theLivingRoom.switchTheLightOfLivingRoom(false);
        System.out.println("");

        // calculateArea() (in Dimensions class)
        theLivingRoom.getDimensions().calculateArea();
        System.out.println("");

        // switchTelevision() (in Television class)
        theLivingRoom.getTheTelevision().switchTelevision(true);
        theLivingRoom.getTheTelevision().switchTelevision(true);
        theLivingRoom.getTheTelevision().switchTelevision(false);
        theLivingRoom.getTheTelevision().switchTelevision(false);
        theLivingRoom.getTheTelevision().switchTelevision(true);
        System.out.println("");

        // screenTypeValidityCheck() (in Television class)
        theLivingRoom.getTheTelevision().screenTypeValidityCheck();
        System.out.println("");

        // increaseVolume() (in Television class)
        theLivingRoom.getTheTelevision().switchTelevision(false);
        theLivingRoom.getTheTelevision().increaseVolume(10);
        theLivingRoom.getTheTelevision().switchTelevision(true);
        theLivingRoom.getTheTelevision().increaseVolume(10);
        theLivingRoom.getTheTelevision().increaseVolume(80);
        theLivingRoom.getTheTelevision().increaseVolume(10);
        theLivingRoom.getTheTelevision().increaseVolume(-20);
        theLivingRoom.getTheTelevision().increaseVolume(-50);
        theLivingRoom.getTheTelevision().increaseVolume(-30);
        theLivingRoom.getTheTelevision().increaseVolume(-30);
    }
}
