package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzz_ {
    //1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz 16 17

    @Test
    public void name() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.get(1));
    }

    private class FizzBuzz {
        public String get(int number) {
            return "1";
        }
    }
}
