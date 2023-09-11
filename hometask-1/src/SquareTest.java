import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getArea() {
        Square square = new Square(4);
        assertEquals(16, square.getArea(), 0.0001);
    }
}