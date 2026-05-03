import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumDigitsTest{

    @Test
    public void toVerifyThatTheSumOfTheNumberOneTwoThreeIsAbsolute(){
    //Given this input
    int number = 123;
    //When used in the method, it...
    int expectResult = SumDigits.sumOfDigit(number);
    //Check that the Output matches
    int actualSumResult = 6;
    //Using this to compare and run the test
    assertEquals(actualSumResult, expectResult);
    }
    @Test
    public void toVerifyThatTheSumOfTheNumberZeroIsAbsolute(){
    //Given this input
    int number = 0;
    //When used in the method, it...
    int expectResult = SumDigits.sumOfDigit(number);
    //Check that the Output matches
    int actualSumResult = 0;
    //Using this to compare and run the test
    assertEquals(actualSumResult, expectResult);
    }
    @Test
    public void toVerifyThatTheSumOfTheNumberNineNintyNineIsAbsolute(){
    //Given this input
    int number = 999;
    //When used in the method, it...
    int expectResult = SumDigits.sumOfDigit(number);
    //Check that the Output matches
    int actualSumResult = 27;
    //Using this to compare and run the test
    assertEquals(actualSumResult, expectResult);
    }
    @Test
    public void toVerifyThatTheSumOfTheNumberOneThousandIsAbsolute(){
    //Given this input
    int number = 1000;
    //When used in the method, it...
    int expectResult = SumDigits.sumOfDigit(number);
    //Check that the Output matches
    int actualSumResult = 1;
    //Using this to compare and run the test
    assertEquals(actualSumResult, expectResult);
    }
}
