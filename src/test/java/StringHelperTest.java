import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    StringHelper helper = new StringHelper();

    @Test
    void test_truncateAInFirst2Positions_A_in_2_pos()
    {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));

    }

    @Test
    void test_truncateAInFirst2Positions_A_in_1_pos()
    {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }
    @Test
    void test_areFirstAndLastTwoCharactersTheSame()
    {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
    }
}