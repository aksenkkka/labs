import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    final StringCalculator calc = new StringCalculator();


    // Крок 1
    @Test
    void ZeroToEmpty() {
        assertEquals(0, calc.add(""));
    }

    @Test
    void NumberForOneNumber() {
        assertEquals(3, calc.add("3"));
    }

    @Test
    void SumOfNumbers() {
        assertEquals(3, calc.add("1,2"));
        assertEquals(3, calc.add("2,1"));
        assertEquals(2, calc.add("1,1"));
    }
}
