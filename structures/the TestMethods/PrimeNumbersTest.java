
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumbersTest{

    @Test
    public void toVerifyThatTwoIsAPrimeNumber(){
    //Given this input
    int number = 2;
    //When used in the method, it...
    boolean expectResult = PrimeNumbers.isPrime(number);
    //Check that the Output matches
    //Using this to compare and run the test
    assertTrue(expectResult);
    }

    @Test
    public void toVerifyThatOneIsAPrimeNumber(){
    //Given this input
    int number = 1;
    //When used in the method, it...
    boolean expectResult = PrimeNumbers.isPrime(number);
    //Check that the Output matches
    //Using this to compare and run the test
    assertFalse(expectResult);
    }

    @Test
    public void toVerifyThatSeventeenIsAPrimeNumber(){
    //Given this input
    int number = 17;
    //When used in the method, it...
    boolean expectResult = PrimeNumbers.isPrime(number);
    //Check that the Output matches
    //Using this to compare and run the test
    assertTrue(expectResult);
    }

    @Test
    public void toVerifyThatFourIsAPrimeNumber(){
    //Given this input
    int number = 4;
    //When used in the method, it...
    boolean expectResult = PrimeNumbers.isPrime(number);
    //Check that the Output matches
    //Using this to compare and run the test
    assertFalse(expectResult);
    }

    @Test
    public void toVerifyThaZeroIsAPrimeNumber(){
    //Given this input
    int number = 0;
    //When used in the method, it...
    boolean expectResult = PrimeNumbers.isPrime(number);
    //Check that the Output matches
    //Using this to compare and run the test
    assertFalse(expectResult);
    }
}
