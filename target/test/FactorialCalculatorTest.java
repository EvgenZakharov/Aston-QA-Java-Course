import org.testng.Assert;
import org.testng.annotations.Test;
import src.lesson_12_junit_5.Main;

public class FactorialCalculatorTest {
    @Test
    public void testFactorialOfZero() {
        Assert.assertEquals(Main.factorial(0), 1);
    }

    @Test
    public void testFactorialOfOne() {
        Assert.assertEquals(Main.factorial(1), 1);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        Assert.assertEquals(Main.factorial(5), 120);
        Assert.assertEquals(Main.factorial(10), 3628800);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        Main.factorial(-1);
    }

}
