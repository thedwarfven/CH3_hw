import java.util.ArrayList;

/**
 * @author Benjamin le
 * tester class of Movement interface which extends Flight
 */

public class ThingsThatMove {
    public static void main(String[] args) {
        ArrayList<Movement> f1 = new ArrayList<Movement>();
        Airplane a1 = new Airplane("Boeing 747",2016);
        Bird b1 = new Bird("Eagle");
        Bird b2 = new Bird("Hummingbird");
        f1.add(a1);
        f1.add(b1);
        f1.add(b2);

        for (Movement flight : f1) {
            System.out.println(flight);
            flight.fly();
            flight.walk();
            flight.jump();
        }
    }
}
