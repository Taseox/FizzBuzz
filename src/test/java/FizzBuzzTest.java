import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void fizzBuzz_Given1_ShouldBe1(){
        String result = new FizzBuzz().fizzBuzz(1);
        Assertions.assertEquals("1", result);
    }

    @Test
    public void fizzBuzz_Given5_ShouldBeFizz(){
        String result = new FizzBuzz().fizzBuzz(5);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void fizzBuzz_Given7_ShouldBeBuzz(){
        String result = new FizzBuzz().fizzBuzz(7);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void fizzBuzz_Given35_ShouldBeFizzBuzz(){
        String result = new FizzBuzz().fizzBuzz(35);
        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    public void fizzBuzz_Contains66_ShouldBeFizzBuzz(){
        String result = new FizzBuzz().fizzBuzz(444466);
        Assertions.assertEquals("FizzBuzz", result);
    }
    @Test
    public void fizzBuzz_GivenNegative_ShouldThrowException(){
        Assertions.assertThrows(Exception.class,
                () -> new FizzBuzz().fizzBuzz(-50));
    }
}
