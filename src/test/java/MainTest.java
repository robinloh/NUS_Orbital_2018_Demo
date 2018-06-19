import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testBoundary1() {
        int x = Main.boundary(1, 8, 9);
        assertEquals(8, x);
    }

    @Test
    public void testBoundary2() {
        int x = Main.boundary(9, 1, 5);
        assertEquals(5, x);
    }

    @Test
    public void testBoundary3() {
        int x = Main.boundary(5, 3, 6);
        assertEquals(5, x);
    }


    @Test
    public void testMaximum1() {
        int m = Main.maximum(9, 3, 6);
        assertEquals(9, m);
    }

    @Test
    public void testMaximum2() {
        int m = Main.maximum(9, 6, 3);
        assertEquals(9, m);
    }

    @Test
    public void testMaximum3() {
        int m = Main.maximum(3, 6, 9);
        assertEquals(9, m);
    }

}
