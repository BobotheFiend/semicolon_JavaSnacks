import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.assertNotNull;


public class SmallMathAppTest{

    SmallMathApp operands;
    @BeforeEach
    void forAll(){
        operands = new SmallMathApp();

//        String operandToUse;
    }


    @Test
    public void thatTheMultiplicationFunctionsReturnsAValue(){
        SmallMathApp operands = new SmallMathApp();
//         double numberOne = 10;
//         double numberTwo = 10;
         String operandToUse = "*";

        double expectedMultiple = operands.getOperation(operandToUse);

        double actualMultiple = 1000.00;

        assertEquals(actualMultiple, expectedMultiple, 0.001);


    }

    @Test
    public void thatTheSubtractionFunctionsReturnsAValue(){

//         numberOne = 60;
//         numberTwo = 30;
         String operandToUse = "-";

        double expectedSubtraction = operands.getOperation(operandToUse);

        double actualSubtraction = 90.00;

        assertEquals(actualSubtraction, expectedSubtraction, 0.001);

    }

    @Test
    public void thatTheAdditionFunctionsReturnsAValue(){

//         numberOne = 400.00;
//         numberTwo = 19.00;
         String operandToUse = "+";

        double expectedAddition = operands.getOperation(operandToUse);

        double actualAddition = 110.00;

        assertEquals(actualAddition, expectedAddition,0.001);

    }

    @Test
    public void thatTheDivisionFunctionsReturnsAValue(){

//         double numberOne = 60;
//         double numberTwo = 30;
         String operandToUse = "/";

        double expectedDivision = operands.getOperation(operandToUse);

        double actualDivision = 10.00;

        assertEquals(actualDivision, expectedDivision, 0.001);
//      Expecting an error message when the denominator is zero
//        double firstNumber = 20;
//        double secondNumber = 0;
        
//        assertThrows(IllegalArgumentException.class, ()-> operands.getOperation(operandToUse));

//        assertNotNull(operand.division(firstNumber,secondNumber));
    }
}
