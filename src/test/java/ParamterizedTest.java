import com.miaque.junit.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by Miaque on 2016/8/26.
 */
@RunWith(value = Parameterized.class)
public class ParamterizedTest {

    private double expected;
    private double valueOne;
    private double valueTwo;

    @Parameterized.Parameters
    public static Collection<Integer[]> getTestParameters() {
        return Arrays.asList(new Integer[][] {
                {2, 1, 1},
                {3, 2, 1},
                {4, 3, 1}
        });
    }

    public ParamterizedTest(double expected, double valueOne, double valueTwo)
    {
        this.expected = expected;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    @Test
    public void sum() {
        Calculator calc = new Calculator();
        assertEquals(expected, calc.add(valueOne, valueTwo), 0);
    }
}
