import org.junit.*;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    @Test
    public void testNullStringCalculator() {
        StringCalculator stringCalculator1 = new StringCalculator();
        int nullString = stringCalculator1.Add("");
        assertEquals(0, nullString);
    }

    @Test
    public void testSingleNumberStringCalculator() {
        StringCalculator stringCalculator2 = new StringCalculator();
        int singleNumber = stringCalculator2.Add("1");
        assertEquals(1, singleNumber);
    }

    @Test
    public void testTwoNumberStringCalculator() {
        StringCalculator stringCalculator2 = new StringCalculator();
        int singleNumber = stringCalculator2.Add("1,2");
        assertEquals(3, singleNumber);
    }



}
