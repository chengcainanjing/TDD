package test;

import main.FizzBuzz2;
import org.junit.Assert;
import org.junit.Test;


/**
 * This program demonstrates FizzBuzzTest2.
 * 程序功能：
 * 1.打印出从1到100的数字
 *
 * 2.将其中3的倍数替换成“Fizz”
 *
 * 3.5的倍数替换成“Buzz”
 *
 * 4.既能被3整除、又能被5整除的数则替换成“FizzBuzz”
 *
 * @author chengcai
 * @version 1.0 2020.02.22
 */

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
