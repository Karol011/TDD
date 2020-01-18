import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class AlgorithmTest {
    private Algorithm algorithm;

    @Before
    public void setUp() {
        algorithm = new Algorithm();
    }

    @Test
    public void shouldReturnFirstPositiveIntegerThatIsAbsentInListOne() {
        //given
        List<Integer> list = new ArrayList<>(Arrays.asList(2, -1, 3));

        //when
        int result = algorithm.find(list);

        //then
        assertEquals(1, result);
    }

    @Test
    @Parameters(method = "generateList")
    public void testList(List<Integer> list, int expected) {

        //when
        int result = algorithm.find(list);

        //then
        assertEquals(expected,result);
    }


    public Object[] generateList() {
        return new Object[]{
                new Object[]{Arrays.asList(2, -1, 3),1},
                new Object[]{Arrays.asList(2, 1, 3),4}
        };
    }

    @Test
    public void shouldReturnFirstPositiveIntegerThatIsAbsentInListFour() {
        //given
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 3));

        //when
        int result = algorithm.find(list);

        //then
        assertEquals(4, result);
    }

    @Test
    public void shouldReturnOneIfGivenNull() {
        //given
        List<Integer> list = new ArrayList<>();

        //when
        int result = algorithm.find(list);

        //then
        assertEquals(1, result);
    }
}