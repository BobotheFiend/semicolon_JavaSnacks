import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TempreatureTest{

    @Test
    
    public void toVerifyThatCelsiusToFahrenheitConvertsEfficentlyCheckingZero(){
    //Given this input
    double tempreatureInCelsius = 0;
    //When used in the method, it...
    double expectTheResult = Tempreature.celsiusToFahrenheit(tempreatureInCelsius);
    //Check that the Output matches
    double actualofTheResult = 32.0;
    //Using this to compare and run the test
    assertEquals(actualofTheResult, expectTheResult);
    }

    @Test
    
    public void toVerifyThatCelsiusToFahrenheitConvertsEfficentlyCheckingHundred(){
    //Given this input
    double tempreatureInCelsius = 100;
    //When used in the method, it...
    double expectTheResult = Tempreature.celsiusToFahrenheit(tempreatureInCelsius);
    //Check that the Output matches
    double actualofTheResult = 212.0;
    //Using this to compare and run the test
    assertEquals(actualofTheResult, expectTheResult);
    }

    @Test
    
    public void toVerifyThatCelsiusToFahrenheitConvertsEfficentlyChickingForty(){
    //Given this input
    double tempreatureInCelsius = -40;
    //When used in the method, it...
    double expectTheResult = Tempreature.celsiusToFahrenheit(tempreatureInCelsius);
    //Check that the Output matches
    double actualofTheResult = -40.0;
    //Using this to compare and run the test
    assertEquals(actualofTheResult, expectTheResult);
    }


}
