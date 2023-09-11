import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(6, rectangle.getArea(), 0.0001);
    }
}