package main;

//import static jdk.nashorn.internal.objects.NativeBoolean.valueOf;

import static java.lang.String.valueOf;

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
 * 5.如果一个数能被3整除，或者包含数字3，那么这个数就是“Fizz”；
 *
 * 6. 如果一个数能被5整除，或者包含数字5，那么这个数就是“Buzz”。
 *
 * @author chengcai
 * @version 2.0 2020.02.23
 */

public class FizzBuzz2 {
    private static String FizzBuzz = "FizzBuzz";
    private static String Fizz = "Fizz";
    private static String Buzz = "Buzz";

    public static String pass(int Num) {
        FizzBuzz2 fizzBuzz2 = new FizzBuzz2();
        if (fizzBuzz2.isRelatedTo(Num, 3) && fizzBuzz2.isRelatedTo(Num, 5)) return FizzBuzz;
        if (fizzBuzz2.isRelatedTo(Num,3)) return Fizz;
        if (fizzBuzz2.isRelatedTo(Num,5)) return Buzz;

        return valueOf(Num);
    }

    private boolean isRelatedTo(int Num, int i) {
        return ((Num % i) == 0) || valueOf(Num).contains(valueOf(i));
    }
}
