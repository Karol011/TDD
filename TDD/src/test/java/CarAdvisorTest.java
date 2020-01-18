import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CarAdvisorTest {
    private CarAdvisor carAdvisor;

    @Before
    public void setup() {
        carAdvisor = new CarAdvisor();
    }

    @Test
    public void ageFifteenShouldReturnBike() {
        //given
        int age = 15;

        //when
        Vehicle result = carAdvisor.advise(age);

        //then
        assertEquals(Vehicle.BIKE, result);
    }
    @Test
    public void ageTwentyThreeShouldReturnFiat() {
        //given
        int age = 23;

        //when
        Vehicle result = carAdvisor.advise(age);

        //then
        assertEquals(Vehicle.FIAT, result);
    }

    @Test
    public void ageFiftyFiveShouldReturnMercedes() {
        //given
        int age = 55;

        //when
        Vehicle result = carAdvisor.advise(age);

        //then
        assertEquals(Vehicle.MERCEDES, result);
    }
}