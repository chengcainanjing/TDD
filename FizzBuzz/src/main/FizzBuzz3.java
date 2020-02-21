package main;


/**
 *
 * @author chengcai
 * @version 1.0
 * @date 2020.02.21
 */
public class FizzBuzz3 {
    public void printNum() {
        for (int Num = 1; Num < 101; Num++) {
            System.out.println(pass(Num));
        }
    }

    public String pass(int Num) {
        String result = "";

        if (Num % 15 == 0) result += "FizzBuzz";
        else if (Num % 3 == 0) result += "Fizz";
        else if (Num % 5 == 0) result += "Buzz";
        else (result.length() == 0) result += Num;

        return result;
    }
}
