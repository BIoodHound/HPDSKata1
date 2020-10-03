package test;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzz_ {
    //1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz 16 17
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_number_when_it_is_not_fizz_and_not_buzz() {
        assertThat(fizzBuzz.of(1)).isEqualTo("1");
        assertThat(fizzBuzz.of(2)).isEqualTo("2");
    }

    @Test
    public void should_return_Fizz_when_it_is_3() {
        assertThat(fizzBuzz.of(3)).isEqualTo("Fizz");
    }

    private class FizzBuzz {
        public String of(int number) {
            return number == 3 ? "Fizz" : String.valueOf(number);
        }
    }
}
