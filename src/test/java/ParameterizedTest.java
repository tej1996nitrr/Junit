import com.sun.org.glassfish.gmbal.ParameterNames;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;
import org.junit.jupiter.params.*;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ParameterizedTest {

    StringHelper helper;

    @BeforeEach
    public void before() {
        helper = new StringHelper();
    }

    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    void palindromes(String candidate) {
        assertTrue(helper.Palindrome(candidate));
    }

    @Test
    void test_truncateAInFirst2Positions_A_in_2_pos() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));

    }


}