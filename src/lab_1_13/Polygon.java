package lab_1_13;

import java.util.List;

public class Polygon {
    public int numbersOfPoints;
    public Point[] points;

    class Point{
        int xCoord;
        int yCoord;
        Point(){
            xCoord = 0; yCoord = 0;
        }
    }
    Polygon(int numbersOfPoints){
        this.numbersOfPoints = numbersOfPoints;
        points = new Point[numbersOfPoints];
        for (int i = 0; i < numbersOfPoints; i++) {
            points[i] = new Point();
        }
    }
    public void setCoordinates(int[] xCoordinates, int[] yCoordinates){
        if(xCoordinates.length >= numbersOfPoints && yCoordinates.length == xCoordinates.length) {
            for (int i = 0; i < numbersOfPoints; i++) {
                points[i].xCoord = xCoordinates[i];
            }
            for (int i = 0; i < numbersOfPoints; i++) {
                points[i].yCoord = yCoordinates[i];
            }
        }else{
            System.out.println("Error");
        }
    }
}
