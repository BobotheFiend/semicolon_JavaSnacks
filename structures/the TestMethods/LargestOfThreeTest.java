
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LargestOfThreeTest{

    @Test
    public void toVerifyThatTheMaxIsThree(){
    //Given this input
    int a = 1;
    int b = 2;
    int c = 3;
    //When used in the method, it...
    int expectResult = LargestOfThree.max(a,b,c);
    //Check that the Output matches
    int actualResult = 3;
    //Using this to compare and run the test
    assertEquals(actualResult ,expectResult);
    }
        @Test
    public void toVerifyThatTheMaxIsAlsoThree(){
    //Given this input
    int a = 3;
    int b = 2;
    int c = 1;
    //When used in the method, it...
    int expectResult = LargestOfThree.max(a,b,c);
    //Check that the Output matches
    int actualResult = 3;
    //Using this to compare and run the test
    assertEquals(actualResult ,expectResult);
    }

        @Test
    public void toVerifyThatTheMaxIsTwo(){
    //Given this input
    int a = 2;
    int b = 2;
    int c = 2;
    //When used in the method, it...
    int expectResult = LargestOfThree.max(a,b,c);
    //Check that the Output matches
    int actualResult = 2;
    //Using this to compare and run the test
    assertEquals(actualResult ,expectResult);
    }
        @Test
    public void toVerifyThatTheMaxIsNegativeOne(){
    //Given this input
    int a = -1;
    int b = -2;
    int c = -3;
    //When used in the method, it...
    int expectResult = LargestOfThree.max(a,b,c);
    //Check that the Output matches
    int actualResult = -1;
    //Using this to compare and run the test
    assertEquals(actualResult ,expectResult);
    }
}
