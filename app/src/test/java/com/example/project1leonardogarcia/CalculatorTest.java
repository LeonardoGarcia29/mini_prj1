package com.example.project1leonardogarcia;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CalculatorTest {
    private void myTest(double P, double rate, int years, boolean withTax, double expected){
        double actual = Calculator.calculate(P,rate,years,withTax);
        assertEquals(expected,actual, 0.01);
    }
    @Test
    public void testWithoutTax(){
        myTest(10000.0,5.5,15,false,81.71);
    }
    @Test
    public void testNoInterestRate(){
        myTest(20000.0,0.0,20,false,83.33);
    }
    @Test
    public void testWithTaxAndInterestRate1(){
        myTest(10000, 5.5,15, true, 91.71);
    }
    @Test
    public void testWithTaxAndInterestRate2(){
        myTest(20000, 10,20, true, 213.00);
    }
    @Test
    public void testWithTaxAndInterestRate3(){
        myTest(10000, 10,30, true, 97.76);
    }
}