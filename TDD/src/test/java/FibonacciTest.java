import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class FibonacciTest {
    private Fibonacci fibonacci;

    @Before
    public void setup() {
        fibonacci = new Fibonacci();
    }


    @Test
    @Parameters({"1,1",
            "5,5",
            "10,55",
            "17,1597"
    })
    public void compute(int a, int expected) {
        int result = fibonacci.compute(a);
        assertEquals(expected, result);
    }
}