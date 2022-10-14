import static org.junit.Assert.*;

public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimal() {
        assertEquals(RomanToDecimal.romanToDecimal("XIV"), 14);
        assertEquals(RomanToDecimal.romanToDecimal("XVII"), 17);
        assertEquals(RomanToDecimal.romanToDecimal("MDCLXXVIII"), 1678);
        assertEquals(RomanToDecimal.romanToDecimal("MDCIXIV"), 1613);
        assertEquals(RomanToDecimal.romanToDecimal("MMMMMMM"), 7000);
        assertEquals(RomanToDecimal.romanToDecimal("LLL"), 150);
        assertEquals(RomanToDecimal.romanToDecimal("XXXXX"), 50);
        assertEquals(RomanToDecimal.romanToDecimal("CMXX"), 920);
        assertEquals(RomanToDecimal.romanToDecimal("III"), 3);
        assertEquals(RomanToDecimal.romanToDecimal("I"), 1);

        assertEquals(RomanToDecimal.romanToDecimal("IVIV"), 10);
        assertEquals(RomanToDecimal.romanToDecimal("IXIX"), 20);
        assertEquals(RomanToDecimal.romanToDecimal("CMCM"), 2000);
        assertEquals(RomanToDecimal.romanToDecimal("XLXL"), 100);

        assertEquals(RomanToDecimal.romanToDecimal("Oops"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("Wow"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("Hey"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("Yes"), -1);

        assertNotEquals(RomanToDecimal.romanToDecimal("Woah"), 1000);
        assertNotEquals(RomanToDecimal.romanToDecimal("XXX"), 1000000);












    }
}