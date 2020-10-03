package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzz_ {
    //1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz 16 17

    @Test
    public void name() {
        String s = new FizzBuzz().get(1);
        assertEquals("1", s);
    }

    private class FizzBuzz {
        public String get(int number) {
            return null;
        }
    }
}
