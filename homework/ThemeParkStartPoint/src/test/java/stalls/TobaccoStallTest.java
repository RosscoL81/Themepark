package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitor = new Visitor(19, 201, 10);
        visitor2 = new Visitor(14, 155, 40);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canBuyTobacco(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void cannotBuyTobacco__too_young(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor2));
    }

    @Test
    public void canGetRating(){
        assertEquals(2, tobaccoStall.getRating());
    }
}
