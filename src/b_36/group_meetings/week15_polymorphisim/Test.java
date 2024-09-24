package b_36.group_meetings.week15_polymorphisim;

public class Test {

    public static void main(String[] args) {

        Person maria1 = new Maria();
        // method in Parent Person class but NOT overridden by Subclass
        maria1.swim(); // Person swims => reference type implementation

        Person maria2 = new Maria();
        // method in Parent Person class but overridden by Subclass
        maria2.eat(); // Maria eats carrots => objects implementation

        Person maria3 = new Maria();
        // method not existing in Parent Person class
        // maria3.playingTennis(); // => we get exception







    }
}
