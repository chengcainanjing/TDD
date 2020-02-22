package main;

public class FizzBuzz2 {
    public static String pass(int Num) {
        if ((Num % 15) == 0) return "FizzBuzz";
        if ((Num % 3) == 0) return "Fizz";
        if ((Num % 5) == 0) return "Buzz";

        return String.valueOf(Num);
    }
}
