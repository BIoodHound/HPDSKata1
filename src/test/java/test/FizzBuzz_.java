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
    public void should_return_Fizz_when_it_is_multiple_of_3() {
        assertThat(fizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.of(6)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Fizz_when_it_is_multiple_of_5() {
        assertThat(fizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(fizzBuzz.of(10)).isEqualTo("Buzz");

    }

    private class FizzBuzz {
        public String of(int number) {
            if (isMultipleOfThree(number)) return "Fizz";
            if (isMultipleOfFive(number)) return "Buzz";
            return String.valueOf(number);
        }

        private boolean isMultipleOfFive(int number) {
            if (number % 5 == 0) return true;
            return false;
        }

        private boolean isMultipleOfThree(int number) {
            if (number % 3 == 0) return true;
            return false;
        }


    }
}
