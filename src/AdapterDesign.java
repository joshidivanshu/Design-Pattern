/**
 * Adaptor Design Patter Implementation.
 *
 * The Adapter design pattern allows incompatible interfaces to work together.
 * It acts as a bridge between two incompatible interfaces by converting ,
 * the interface of a class into another interface that a client expects.
 *
 * @author Divanshu Joshi
 * @version 1.0
 * @since 2023-10-01
 */
class LegacyRectangle {
    public int calculateArea() {
        return 5 * 10;
    }
}

interface Rectangle {
    int calculateArea();
}

class RectangleAdapter implements Rectangle {
    private LegacyRectangle legacyRectangle;

    public RectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public int calculateArea() {
        return legacyRectangle.calculateArea();
    }
}

/**
 * Client Class.
 *
 * Class that will be used by client to start a computer.
 *
 * @author Divanshu Joshi
 * @version 1.0
 * @since 2023-10-01
 */
public class AdapterDesign {
    public static void main(String[] args) {
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        Rectangle adapter = new RectangleAdapter(legacyRectangle);
        int area = adapter.calculateArea();
        System.out.println("Area of the rectangle:  " + area);
    }
}
