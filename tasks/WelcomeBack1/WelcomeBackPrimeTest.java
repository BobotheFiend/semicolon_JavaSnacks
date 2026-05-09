import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WelcomeBackPrimeTest{

    @Test
    public void testThatTheNumberReturnTrueIfItIsPrime(){
    int number = 17;
    boolean expectedResult = WelcomeBackPrime.primeNumbers(number);
    assertTrue(expectedResult);
    }

    @Test
    public void testThatTheNumberReturnsFalseIfItIsNotPrime(){
    int number = 44;
    boolean expectedResult = WelcomeBackPrime.primeNumbers(number);
    assertFalse(expectedResult);
    }
}
