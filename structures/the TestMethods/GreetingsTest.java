
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreetingsTest{

    @Test
    public void toVerifyTheNameAlicePrintsAccordinly(){
    //Given this input
    String name = "Alice";
    //When used in the method, it...
    String expectResult = Greetings.greet(name);
    //Check that the Output matches
    String actualResult = "'Hello,Alice!'";
    //Using this to compare and run the test
    assertEquals(actualResult ,expectResult);
    }

    @Test
    public void toVerifyTheNameWorldPrintsAccordinly(){
    //Given this input
    String name = "World";
    //When used in the method, it...
    String expectResult = Greetings.greet(name);
    //Check that the Output matches
    String actualResult = "'Hello,World!'";
    //Using this to compare and run the test
    assertEquals(actualResult ,expectResult);
    }

    @Test
    public void toVerifyTheNameSpacePrintsAccordinly(){
    //Given this input
    String name = "";
    //When used in the method, it...
    String expectResult = Greetings.greet(name);
    //Check that the Output matches
    String actualResult = "'Hello,!'";
    //Using this to compare and run the test
    assertEquals(actualResult ,expectResult);
    }
}
