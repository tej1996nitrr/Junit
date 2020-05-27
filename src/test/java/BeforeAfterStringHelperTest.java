import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BeforeAfterStringHelperTest {
    @BeforeAll
    public static void  beforeAll()
    {
        System.out.println("Before All");
    }
    @BeforeEach
    public void setUp()
    {
       System.out.println("Before Test");
    }

    @Test
    void truncateAInFirst2Positions() {
        System.out.println(" Test1");
    }

    @Test
    void areFirstAndLastTwoCharactersTheSame() {
        System.out.println(" Test2");

    }
    @AfterEach
    public void teardown(){System.out.println("After Test");}
    @AfterAll
    public static void  AfterAll()
    {
        System.out.println("After All");
    }
}