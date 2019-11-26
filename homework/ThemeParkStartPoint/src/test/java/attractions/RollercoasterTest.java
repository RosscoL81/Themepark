package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(19, 201, 10);
        visitor2 = new Visitor(14, 130, 40);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRideRollercoaster(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void cannotRideRollercoaster__notTallEnough(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void getDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void getDoublePrice__visitorOver200(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.01);
    }

    @Test
    public void getSinglePrice__visitorUnder200(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor2), 0.01);
    }
}
