package main;

/**
 * This program demonstrates FizzBuzz2.
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

public class FizzBuzz2 {
    public static String pass(int Num) {
        if ((Num % 15) == 0) return "FizzBuzz";
        if ((Num % 3) == 0) return "Fizz";
        if ((Num % 5) == 0) return "Buzz";

        return String.valueOf(Num);
    }
}
