package Lessons;

import org.junit.Assert;

import static org.junit.Assert.*;

public class CalculatorTest {
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

    @org.junit.Test
    public void chooseoperation() throws Exception {
        Calculator calculator = new Calculator();
        calculator.chooseoperation("plus",1,2);
        assertEquals(3, calculator.getResult());
    }

}