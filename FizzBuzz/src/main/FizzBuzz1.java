package main;


/**
 *
 *
 *
 */
public class FizzBuzz1 {

    public void printNum() {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println(pass(i));
        }
    }


    public static String pass(int i) {
        String result = "";

        if (i%15 == 0) result += "FizzBuzz";
        else if (i%3 == 0) result += "Fizz";
        else if (i%5 == 0) result += "Buzz";
        else if (result.length() == 0) result += i;

        return result;
    }
}
