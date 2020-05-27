import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
//import org.junit.jupiter.a
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {
@Test
    public void Test(){
    int[] numbers = {12,3,1,5};
    int[] expected={1,3,5,12};
    Arrays.sort(numbers);
    assertArrayEquals(expected,numbers);
}
@Test
@Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void testSort_performance()
{
    int[] array ={12,3,4};
    for(int i=0;i<1000000;i++)
    {
        array[0]=i;
        Arrays.sort(array);
    }
}
}