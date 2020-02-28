package main;

import static java.lang.String.valueOf;

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
public class FizzBuzz4 {
    public static String passNum(int number) {
        FizzBuzz4 fizzBuzz4 = new FizzBuzz4();
        if (fizzBuzz4.isRelateTo(number, 3) && fizzBuzz4.isRelateTo(number, 5)) return "FizzBuzz";
        if (fizzBuzz4.isRelateTo(number, 3)) return "Fizz";
        if (fizzBuzz4.isRelateTo(number, 5)) return "Buzz";

        return valueOf(number);
    }

    private boolean isRelateTo(int number, int i) {
     return (number % i==0) || (valueOf(number).contains(valueOf(i)));
    }
}
