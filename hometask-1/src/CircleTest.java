import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {
        Circle circle = new Circle(1);
        assertEquals(3.14, circle.getArea(), 0.0001);
    }
}