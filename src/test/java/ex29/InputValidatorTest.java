package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InputValidatorTest {

    @org.junit.jupiter.api.Test
    public void testIsNumeric() {
        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("a");
        });
        assertEquals(Integer.parseInt("1"), 1);
    }

    @Test
    void isNonZero() {
        assertNotEquals(1,0);
    }
}