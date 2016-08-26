import com.miaque.junit.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Miaque on 2016/8/26.
 */
public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        assertEquals(60, result, 0);
    }
}
