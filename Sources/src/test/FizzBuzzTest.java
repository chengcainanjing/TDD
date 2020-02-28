package test;

import main.FizzBuzz;
import org.junit.Assert;
//import org.junit.Assert.*;
import org.junit.Test;

/**
 * This program demonstrates FizzBuzzTest.
 * 程序功能：
 *   1.打印出从1到100的数字
 *
 *   2.将其中3的倍数替换成“Fizz”
 *
 *   3.5的倍数替换成“Buzz”
 *
 *   4.既能被3整除、又能被5整除的数则替换成“FizzBuzz”
 *
 * @author chengcai
 * @version 1.0 2020.02.19
 */
public class FizzBuzzTest {
    @Test
    public void testPrint() {
        FizzBuzz fizz1 = new FizzBuzz();
        Assert.assertEquals("1", fizz1.pass(1));
        Assert.assertEquals("Fizz", fizz1.pass(3));
        Assert.assertEquals("Buzz", fizz1.pass(5));
        Assert.assertEquals("FizzBuzz", fizz1.pass(15));
        fizz1.printNum();
    }
}
