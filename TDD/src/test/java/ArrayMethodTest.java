import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayMethodTest {
    private ArrayMethod arrayMethod;

    @Before
    public void setUp() {
        arrayMethod = new ArrayMethod();
    }

    @Test
    public void checkHowManyValuesAreTheSameAtTheSamePosition() {

        //given
        int[] array = new int[]{4, 2, 4, 1};
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 4, 1, 5, 4, 3, 2));

        //when
        int result = arrayMethod.checkDuplicates(array,integerList);

        //then
        assertEquals(3,result);

    }
}