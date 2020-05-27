import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {
@Test
    public void Test(){
    int[] numbers = {12,3,1,5};
    int[] expected={1,3,5,12};
    Arrays.sort(numbers);
    assertArrayEquals(expected,numbers);
}
}