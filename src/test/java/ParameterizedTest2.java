import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
//junit4
@RunWith(Parameterized.class)
public class ParameterizedTest2 {
    StringHelper helper = new StringHelper();
    private String input;
    private String expectedOutput;

    public ParameterizedTest2(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions()
    { String expectedOutput[][]={
            {"AACD","CD"},{"ACD","CD"}
    };
        return Arrays.asList(expectedOutput);
    }
    @Test
    public void testTruncatedAInFirst2Pos()
    {
        assertEquals(expectedOutput,helper.truncateAInFirst2Positions(input));
    }


}