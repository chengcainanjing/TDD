package main;

/**
 * This program demonstrates FizzBuzz.
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
 * @version 1.0 2020.02.19
 */
public class FizzBuzz {

    public void printNum(){
        for (int i = 1; i <= 100; i++) {
            System.out.println(pass(i));
        }
    }

    public String pass(int i) {
        if (i%15 == 0) {
            return "FizzBuzz";
        }
        else if (i%3 == 0) {
            return  "Fizz";
        }
        else if (i%5 == 0) {
            return  "Buzz";
        }
        else {
            return i+"";
        }
    }

}
