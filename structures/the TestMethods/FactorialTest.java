import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest{

    @Test
    public void toVerifyTheFactorialOfZero(){
    //Given this input
    int number = 0;
    //When used in the method, it...
    int expectResult = Factorial.factorial(number);
    //Check that the Output matches
    int actualResult = 1;
    //Using this to compare and run the test
    assertEquals(actualResult ,expectResult);
    }

    @Test
    public void toVerifyTheFactorialOfOne(){
    //Given this input
    int number = 1;
    //When used in the method, it...
    int expectResult = Factorial.factorial(number);
    //Check that the Output matches
    int actualResult = 1;
    //Using this to compare and run the test
    assertEquals(actualResult ,expectResult);
    }

    @Test
    public void toVerifyTheFactorialOfFive(){
    //Given this input
    int number = 5;
    //When used in the method, it...
    int expectResult = Factorial.factorial(number);
    //Check that the Output matches
    int actualResult = 120;
    //Using this to compare and run the test
    assertEquals(actualResult ,expectResult);
    }

    @Test
    public void toVerifyTheFactorialOfSix(){
    //Given this input
    int number = 6;
    //When used in the method, it...
    int expectResult = Factorial.factorial(number);
    //Check that the Output matches
    int actualResult = 720;
    //Using this to compare and run the test
    assertEquals(actualResult ,expectResult);
    }
}
