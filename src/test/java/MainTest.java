import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testAdd() {
        Main testMain = new Main();

        assertEquals(5, testMain.add(3, 2));
        assertEquals(16, testMain.add(7, 9));
        assertEquals(6, testMain.add(3, 3));
        assertEquals(275, testMain.add(75, 200));
        assertEquals(264, testMain.add(132, 132));
    }

}