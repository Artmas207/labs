package lab_3_13;

public class MQM {
    public static double calculate(int[] xArray, int[] yArray){
        double firstNumber = 0;
        double secondNumber = 0;

        if(xArray.length == yArray.length){
            for (int i = 0; i < xArray.length; i++) {
                firstNumber += xArray[i] * yArray[i];
                secondNumber += xArray[i] * xArray[i];
            }
        }
        return firstNumber/secondNumber;

    }
}
