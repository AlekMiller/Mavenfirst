package Lessons;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void multi() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(2,2);
        calculator.multi(2,2);
        assertEquals(16,calculator.getResult());
    }

    @Test
    public void div() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(10,2);
        calculator.div(2,3);
        assertEquals(2,calculator.getResult());
    }
    @Test (expected = UserException.class)
    public void divException () throws Exception {
        Calculator calculator = new Calculator();
        calculator.div();

    }
    @Test (expected = IllegalArgumentException.class)
    public void divExceptionZero () throws Exception {
        Calculator calculator = new Calculator();
        calculator.div(1,0);
    }

    @org.junit.Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1,2);
       assertEquals(3, calculator.getResult());
    }

    @org.junit.Test
    public void minus() throws Exception {
        Calculator calculator = new Calculator();
        calculator.minus(3,1);
        assertEquals(2,calculator.getResult());
    }

    @Test (expected = UserException.class)
    public void chooseOperation() throws Exception {
        Calculator calculator = new Calculator();
        calculator.chooseOperation("ss",1,2);

    }

}