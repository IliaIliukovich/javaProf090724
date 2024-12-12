package summary20241206;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task5Test {

    @Test
    public void testVerify() {
        boolean result = Task5.verify("12345678Aa-");
        assertTrue(result);
        assertTrue(Task5.verify("45678Aa-"));
        assertTrue(Task5.verify("123456789999Aa-"));

        assertFalse(Task5.verify("1234Aa-"));
        assertFalse(Task5.verify("123456789999Aa-1"));

        assertFalse(Task5.verify("Aa-gnwngwrng"));
        assertFalse(Task5.verify("12345678aa-"));
        assertFalse(Task5.verify("12345678AA-"));
        assertFalse(Task5.verify("12345678Aa1"));

        assertTrue(Task5.verify("12345678Aa~"));
        assertTrue(Task5.verify("12345678Aa!"));
        assertTrue(Task5.verify("12345678Aa#"));
        assertTrue(Task5.verify("12345678Aa$"));
        assertTrue(Task5.verify("12345678Aa/"));
        assertTrue(Task5.verify("12345678Aa_"));
        assertTrue(Task5.verify("12345678Aa\\"));

        assertFalse(Task5.verify(null));
        assertFalse(Task5.verify(""));
    }

}
