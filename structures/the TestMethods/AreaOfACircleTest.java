
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AreaOfACircleTest{

    @Test
    public void toVerifyTheRadiusOfOne(){
    //Given this input
    double number = 1.0;
    //When used in the method, it...
    double expectResult = AreaOfACircle.circleArea(number);
    //Check that the Output matches
    double actualResult = 3.14159;
    //Using this to compare and run the test
    assertEquals(0.001, actualResult ,expectResult);
    }

    @Test
    public void toVerifyTheRadiusOfFive(){
    //Given this input
    double number = 5.0;
    //When used in the method, it...
    double expectResult = AreaOfACircle.circleArea(number);
    //Check that the Output matches
    double actualResult = 78.5398;
    //Using this to compare and run the test
    assertEquals(0.001, actualResult ,expectResult);
    }

    @Test
    public void toVerifyTheRadiusOfZero(){
    //Given this input
    double number = 0.0;
    //When used in the method, it...
    double expectResult = AreaOfACircle.circleArea(number);
    //Check that the Output matches
    double actualResult = 0.0;
    //Using this to compare and run the test
    assertEquals(actualResult ,expectResult);
    }
}
