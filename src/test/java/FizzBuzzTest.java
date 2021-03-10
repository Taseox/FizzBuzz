import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void fizzBuzz_Given1_ShouldBe1(){
        String result = new FizzBuzz().fizzBuzz(1);
        Assertions.assertEquals(1, result);
    }
}
