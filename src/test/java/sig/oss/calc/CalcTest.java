package sig.oss.calc;

import static org.junit.Assert.*;
import org.junit.*;

public class CalcTest {
    @Test
    public void testAdd() {
        Calc c = new Calc();
        c.add(10, 20);
        assertEquals(30, c.getResult());
    }
    
    @Test
    public void testSub() {
        Calc c = new Calc();
        c.sub(10, 20);
        assertEquals(-10, c.getResult());
    }
}