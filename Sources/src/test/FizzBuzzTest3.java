package test;

import main.FizzBuzz3;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest3 {

    FizzBuzz3 fizz3 = new FizzBuzz3();

    @Test
    public void shouldInput1Output1() {
        Assert.assertEquals(fizz3.pass(1), "1");
    }

    @Test
    public void shouldInput3OutputFizz() {
        Assert.assertEquals(fizz3.pass(3), "Fizz");
    }

    @Test
    public void shouldInput5OutputBuzz() {
        Assert.assertEquals(fizz3.pass(5), "Buzz");
    }

    @Test
    public void shouldInput15OutputFizzBuzz() {
        Assert.assertEquals(fizz3.pass(15), "FizzBuzz");
    }

    @Test
    public void fizz3PrintNum() {
        fizz3.printNum();
    }
}

