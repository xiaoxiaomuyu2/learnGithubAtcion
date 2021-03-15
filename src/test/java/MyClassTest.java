import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void getVal() {
        int val = 666;
        MyClass mc = new MyClass(val);
        assertEquals(val, mc.getVal());
    }
}