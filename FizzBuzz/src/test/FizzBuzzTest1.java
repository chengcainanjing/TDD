package test;

import main.FizzBuzz;
import main.FizzBuzz1;
import org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;


public class FizzBuzzTest1 {
    @Test
    public void TestPrint() {
        FizzBuzz1 fizz1 = new FizzBuzz1();
        assertEquals("1", FizzBuzz1.pass(1));
        assertEquals("Fizz", FizzBuzz1.pass(3));
        assertEquals("Buzz", FizzBuzz1.pass(5));
        assertEquals("FizzBuzz", FizzBuzz1.pass(15));
        fizz1.printNum();
    }
}