
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KatasTest {

    private static Katas katas;

    @BeforeAll
    static void setUp() {
        katas = new Katas();
    }

    @Test
    void testReverseString(){

        String expected = "cBa";
        String result = katas.reverseString("aBc");
        assertEquals(expected, result);
    }

    @Test
    void testStringToUpperCase(){

        String expected = "ABC";
        String result = katas.stringToUpperCase("aBc");
        assertEquals(expected, result);
    }

    @Test
    void testStringToLowerCase(){

        String expected = "abc";
        String result = katas.stringToLowerCase("aBc");
        assertEquals(expected, result);

    }



}
