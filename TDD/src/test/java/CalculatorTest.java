import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)  //trzeba to dodac recznie
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    //ASSERTJ**************************************************************************************

    @Test
    public void testCalculateAssertJ() {
        //given
        int a = 2;
        int b = 2;

        //when
        int result = calculator.calculate(a, b);

        //then
        Assertions.assertThat(result)
                .isEqualTo(4)
                .isLessThan(5)
                .isPositive();

    }

    @Test
    public void testSubstractionAssertJ() {
        //given
        int a = 15;
        int b = 7;

        //when
        int result = calculator.substract(a, b);

        //then
        Assertions.assertThat(result)
                .isPositive()
                .isEqualTo(8)
                .isNotNull()
                .isBetween(5,10);
    }


    //JUNIT PARAMS********************************************************************************************************
    @Test
    @Parameters({"1,2,3",
            "3,4,7",
            "9,1,10"})
    public void testCalculate(int a, int b, int expected) {
        //when
        int result = calculator.calculate(a, b);

        //then
        assertEquals(expected, result);
    }

    @Test
    @Parameters(method = "generateData")
    public void testCalculateGeneratedData(int a, int b, int expected) {

        assertEquals(expected, calculator.calculate(a, b));
    }

    public Object[] generateData() {
        return new Object[]{
                new Object[]{1, 2, 3},
                new Object[]{4, 11, 15},
                new Object[]{-10, 20, 10}
        };

    }

    @Test
    @Parameters({"1,2,2",
            "3,4,12",
            "9,1,9"})
    public void testMultiplaying(int a, int b, int expected) {
        //when
        int result = calculator.multiply(a, b);

        //then
        assertEquals(expected, result);
    }

    //JUNIT********************************************************************************************************
    @Test
    public void calculateShouldReturnFiveWhenThreeAndTwo() {
        //given
        int a = 3;
        int b = 2;

        //when
        int result = calculator.calculate(a, b);
        //then
        assertEquals(5, result);

    }

    @Test
    public void substractTenAndThreeShouldGiveSeven() {
        //given
        int a = 10;
        int b = 3;

        //when
        int result = calculator.substract(a, b);
        //then
        assertEquals(7, result);

    }

    @Test
    public void multiplayThreeAndThreeShouldReturnNine() {
        //given
        int a = 3;
        int b = 3;

        //when
        int result = calculator.multiply(a, b);
        //then
        assertEquals(9, result);

    }

    @Test
    public void divideTwentyAndFourShouldGiveFive() {
        //given
        int a = 20;
        int b = 4;

        //when
        int result = calculator.divide(a, b);
        //then
        assertEquals(5, result);

    }
}