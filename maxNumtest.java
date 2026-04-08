import org.junit.Test;
import static org.junit.Assert.*;

public class MaxNumberTest {

    MaxNumber m = new MaxNumber();

    @Test // ✅ PASS
    public void testMax1() {
        assertEquals(10, m.findMax(10, 5, 3));
    }

    @Test // ✅ PASS
    public void testMax2() {
        assertEquals(8, m.findMax(2, 8, 5));
    }

    @Test // ❌ FAIL
    public void testFail1() {
        assertEquals(5, m.findMax(10, 5, 3)); // wrong
    }

    @Test // ❌ FAIL
    public void testFail2() {
        assertEquals(2, m.findMax(2, 8, 5)); // wrong
    }
}
