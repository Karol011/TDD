import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class StringUtilsTest {
    private StringUtils stringUtils;

    @Before
    public void setup() {
        stringUtils = new StringUtils();
    }

    @Test
    public void changeToUpperCase() {
        //given
        String input = "abbakus";

        //when
        String result = stringUtils.changeToUpperCase(input);

        //then
        Assertions.assertThat(result)
                .isEqualTo("ABBAKUS")
                .isNotNull();
    }

    @Test
    @Parameters({"kajak,kajak",
            "ikajak,kajaki",
            "oko,oko"
    })
    public void reverseString(String input, String expected) {

        String result = stringUtils.reverseString(input);

        assertEquals(expected, result);

    }

    @Test
    public void multipleString() {
    }

    @Test
    public void countCharInString() {
        //given
        String input = "abbakus";
        char letter = 'b';

        //when
        Long result = stringUtils.countCharInString(input, letter);

        //then
        Assertions.assertThat(result)
                .isNotNull()
                .isEqualTo(2);
    }
}