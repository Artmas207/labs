package lab_2_9;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordAnalyzerTest {

    @Test
    public void isStrongPassword() {
        Assert.assertTrue(PasswordAnalyzer.isStrongPassword("C00l_Pass"));

        Assert.assertTrue(PasswordAnalyzer.isStrongPassword("SupperPas1"));

        Assert.assertFalse(PasswordAnalyzer.isStrongPassword("Cool_pass"));

        Assert.assertFalse(PasswordAnalyzer.isStrongPassword("C00l"));
    }
}