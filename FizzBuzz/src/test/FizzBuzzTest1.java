package test;

import main.FizzBuzz1;
//import org.junit.Assert.*;
import org.junit.Test;
//import org.junit.Assert;

import static main.FizzBuzz1.*;
import static org.junit.Assert.*;


public class FizzBuzzTest1 {
    @Test
    public void TestPrint() {
        FizzBuzz1 fizz1 = new FizzBuzz1();
        assertEquals("1", pass(1));
        assertEquals("Fizz", pass(3));
        assertEquals("Buzz", pass(5));
        assertEquals("FizzBuzz", pass(15));
        fizz1.printNum();
    }
}