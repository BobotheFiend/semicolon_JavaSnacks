import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenCheckerTest{

    @Test
    public void toVerifyTheNumberFourIsEven(){
    //Given this input
    int number = 4;
    //When used in the method, it...
    boolean expectResult = EvenChecker.isEven(number);
    //Check that the Output matches
    //Using this to compare and run the test
    assertTrue(expectResult);
    }

    @Test
    public void toVerifyTheNumberSevenIsNotEven(){
    //Given this input
    int number = 7;
    //When used in the method, it...
    boolean expectResult = EvenChecker.isEven(number);
    //Check that the Output matches
    //Using this to compare and run the test
    assertFalse(expectResult);
    }

    @Test
    public void toVerifyTheNumberZeroIsEven(){
    //Given this input
    int number = 0;
    //When used in the method, it...
    boolean expectResult = EvenChecker.isEven(number);
    //Check that the Output matches
    //Using this to compare and run the test
    assertTrue(expectResult);
    }
    
    @Test
    public void toVerifyTheNumberNegativeTwoIsEven(){
    //Given this input
    int number = -2;
    //When used in the method, it...
    boolean expectResult = EvenChecker.isEven(number);
    //Check that the Output matches
    //Using this to compare and run the test
    assertTrue(expectResult);
    }


}
