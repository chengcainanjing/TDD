package test;

import main.FizzBuzz2;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest2 {
    @Test
    public void printNum() {
        Assert.assertEquals(FizzBuzz2.pass(1), "1");
    }

    @Test
    public void Input_3_Output_Fizz() {
        Assert.assertEquals(FizzBuzz2.pass(3), "Fizz");
    }

    @Test
    public void Input_5_Output_Buzz() {
        Assert.assertEquals(FizzBuzz2.pass(5), "Buzz");
    }

    @Test
    public void Input_15_Output_FizzBuzz() {
        Assert.assertEquals(FizzBuzz2.pass(15), "FizzBuzz");
    }
}
