package lab_1_13;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AreaCalculatorTest {

    private static final double DELTA = 1e-15;

    @Test
    public void area() {
        Polygon testPolygon = new Polygon(3);
        int[] xCoords = {-4, 2, 5};
        int[] yCoords = {3, 5, 1};
        double expectedarea = 15;

        Polygon polygon = new Polygon(3);
        polygon.setCoordinates(xCoords, yCoords);

        double receivedArea = AreaCalculator.area(polygon);

        Assert.assertEquals(expectedarea, receivedArea, DELTA);
    }
}