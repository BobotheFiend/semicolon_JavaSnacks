import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConsecutiveNumbersTest{

    @Test
    public void testThatIHaveAnELement_ouputReturnsTheNumberThatSumsForTheLargest(){
        int [] numbers = {5, 1, 5, 7, 8,};
        int [] expected = ConsecutiveNumbers.getLargestSum(numbers);
        int [] actual = {5, 7, 8};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testThatIHaveAnAnotherELement_ouputReturnsTheNumberThatSumsForTheLargest(){
        int [] numbers = {13, 7, 1, 8, 2,0,6,2,1};
        int [] expected = ConsecutiveNumbers.getLargestSum(numbers);
        int [] actual = {13, 7, 1};
        assertArrayEquals(actual, expected);
    }
}

