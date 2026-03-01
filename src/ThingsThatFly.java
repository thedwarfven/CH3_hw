import java.util.ArrayList;

/**
 * @author Benjamin le
 * tester class of Flight interface
 */

public class ThingsThatFly {
    public static void main(String[] args) {
        ArrayList<Flight> flights = new ArrayList<Flight>();
        Airplane a1 = new Airplane("Boeing 747",2016);
        Bird b1 = new Bird("Eagle");
        Bird b2 = new Bird("Hummingbird");
        flights.add(a1);
        flights.add(b1);
        flights.add(b2);

        for (Flight flight : flights) {
            System.out.print(flight);
            flight.fly();
        }
    }
}
