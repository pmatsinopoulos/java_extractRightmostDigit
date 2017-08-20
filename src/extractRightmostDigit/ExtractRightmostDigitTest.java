package extractRightmostDigit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExtractRightmostDigitTest {

    @Test
    public void testExtractDigits() {
        assertEquals(1, ExtractRightmostDigit.extractDigits(121, 2));
    }

}
