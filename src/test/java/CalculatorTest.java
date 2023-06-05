import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    public void canMultiply(){
        assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(3.5, calculator.divide(7.0, 2.0), 0.0);
    }
}
