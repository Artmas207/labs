package lab_1_13;

public class Main {
    public static void main(String[] args) {
        int[] xCoords = {-4, 2, 5};
        int[] yCoords = {3, 5, 1};

        Polygon polygon = new Polygon(3);
        polygon.setCoordinates(xCoords, yCoords);

        System.out.println(AreaCalculator.area(polygon));


    }
}
