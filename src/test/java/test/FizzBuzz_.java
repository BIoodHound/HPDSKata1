package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzz_ {
    //1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz 16 17

    @Test
    public void should_return_number_when_it_is_not_fizz_and_not_buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.get(1));
    }

    private class FizzBuzz {
        public String get(int number) {
            return "1";
        }
    }
}
