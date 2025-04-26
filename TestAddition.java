package addition;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class TestAddition{

    @Test
    public void testAddWithRandomNumbers() {
        Random rand = new Random();

        int a = rand.nextInt(100); // random number between 0-99
        int b = rand.nextInt(100);

        Addition adder = new Adder();
        int actualResult = adder.add(a, b);
        int expectedResult = Math.addExact(a, b); // Java built-in addition

        System.out.println("Testing addition: " + a + " + " + b);
        assertEquals(expectedResult, actualResult, "Addition did not match!");
    }
}
