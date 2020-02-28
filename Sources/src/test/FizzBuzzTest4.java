package test;

import main.FizzBuzz4;
import org.junit.Assert;
import org.junit.Test;

/**
 * This program demonstrates FizzBuzzTest2.
 * 程序功能：
 * 1.打印出从1到100的数字
 * <p>
 * 2.将其中3的倍数替换成“Fizz”
 * <p>
 * 3.5的倍数替换成“Buzz”
 * <p>
 * 4.既能被3整除、又能被5整除的数则替换成“FizzBuzz”
 *
 * 5.如果一个数能被3整除，或者包含数字3，那么这个数就是“Fizz”；
 *
 * 6. 如果一个数能被5整除，或者包含数字5，那么这个数就是“Buzz”。
 *
 * @author chengcai
 * @version 1.0 2020.02.25
 */
public class FizzBuzzTest4 {
    @Test
    public void input_Num_Output_Num() {
        assertEquals(1, "1");
        assertEquals(2, "2");
        assertEquals(98, "98");
    }

    @Test
    public void input_Contains_3_Output_Fizz() {
        assertEquals(3, "Fizz");
        assertEquals(13, "Fizz");
        assertEquals(63, "Fizz");
    }

    @Test
    public void input_Contains_5_Output_Buzz() {
        assertEquals(5, "Buzz");
        assertEquals(10, "Buzz");
        assertEquals(55, "Buzz");
    }

    @Test
    public void input_Contains_15_Output_FizzBuzz() {
        assertEquals(15, "FizzBuzz");
    }

    private void assertEquals(int Number, String string) {
        Assert.assertEquals(FizzBuzz4.passNum(Number), string);
    }
}
