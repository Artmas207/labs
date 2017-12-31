package lab_3_13;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MQMTest {

    @Test
    public void calculate() {
        int[] xArray = {2, 4, 8}; int[] yArray = {1, 2, 4};
        Assert.assertEquals(MQM.calculate(xArray, yArray), 0.5, 1e-15);
    }
}