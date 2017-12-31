package lab_1_13;

public class AreaCalculator {
    public static double area(Polygon polygon){
        double area = 0;
        for (int i = 0; i < polygon.numbersOfPoints; i++) {
            if(i < polygon.numbersOfPoints - 1){
                area += polygon.points[i].xCoord * polygon.points[i+1].yCoord - polygon.points[i].yCoord * polygon.points[i+1].xCoord;
            }else{
                area += polygon.points[i].xCoord * polygon.points[0].yCoord - polygon.points[i].yCoord * polygon.points[0].xCoord;
            }
        }
        area /= 2;
        area = Math.abs(area);
        return area;
    }
}
